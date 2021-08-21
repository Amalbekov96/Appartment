package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.CodesDto;
import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Enums.CodeStatus;
import kg.one.flat.Models.Mapper.CodesMapper;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Models.Users;
import kg.one.flat.Repository.CodesRepo;
import kg.one.flat.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UsersServiceImpl extends BaseServiceImpl<Users, UsersDto, UsersMapper, UsersRepo>{
    public UsersServiceImpl(UsersRepo repo, UsersMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UsersRepo usersRepo;
    @Autowired
    private CodesMapper codesMapper;
    @Autowired
    private CodesRepo codesRepo;
    @Autowired
    BlackListServiceImpl blackListService;

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public CodesDto findUserByPhone(String phone, Boolean isBroker){

        UsersDto userDto = usersMapper.toDto(usersRepo.findByPhone(phone));
        Random rand = new Random();

        List<CodesDto> codesList = codesMapper.toListDto(codesRepo.findAllByUsersAndEndDateIsBefore(usersMapper.toEntity(userDto), LocalDateTime.now()));
        for(CodesDto co : codesList){
            if(co.getStatus() == CodeStatus.NEW){
                co.setStatus(CodeStatus.NOT_USED);
            }
        }
        codesRepo.saveAll(codesMapper.toListEntity(codesList));

            if(userDto == null){
                Users user = new Users();
                user.setPhone(phone);
                user.setIsBroker(isBroker);
                UsersDto usersDto = usersMapper.toDto(usersRepo.save(user));

                String code = String.format("%04d", rand.nextInt(10000));

                CodesDto newCodeDto = new CodesDto();
                newCodeDto.setCode(code);
                newCodeDto.setUsers(usersDto);
                newCodeDto.setStatus(CodeStatus.NEW);
                LocalDateTime time = LocalDateTime.now();
                newCodeDto.setStartDate(time);
                newCodeDto.setEndDate(time.plusMinutes(3));

                LOGGER.log(Level.INFO, "New user was created and new code was generated!");

                return codesMapper.toDto(codesRepo.save(codesMapper.toEntity(newCodeDto)));
            } else {

                CodesDto oldCode = codesMapper.toDto(codesRepo.findByUsersAndEndDateIsAfter(usersMapper.toEntity(userDto), LocalDateTime.now()));
                if(oldCode == null){
                    String code = String.format("%04d", rand.nextInt(10000));
                    CodesDto newCodeDto = new CodesDto();
                    newCodeDto.setCode(code);
                    newCodeDto.setUsers(userDto);
                    newCodeDto.setStatus(CodeStatus.NEW);
                    LocalDateTime time = LocalDateTime.now();
                    newCodeDto.setStartDate(time);
                    newCodeDto.setEndDate(time.plusMinutes(3));
                    LOGGER.log(Level.INFO, "New code was generated!");
                    return codesMapper.toDto(codesRepo.save(codesMapper.toEntity(newCodeDto)));

                } else {
                    oldCode.setStatus(CodeStatus.CANCELLED);
                    codesMapper.toDto(codesRepo.save(codesMapper.toEntity(oldCode)));

                    String code = String.format("%04d", rand.nextInt(10000));
                    CodesDto newCodeDto = new CodesDto();
                    newCodeDto.setCode(code);
                    newCodeDto.setUsers(userDto);
                    newCodeDto.setStatus(CodeStatus.NEW);
                    LocalDateTime time = LocalDateTime.now();
                    newCodeDto.setStartDate(time);
                    newCodeDto.setEndDate(time.plusMinutes(3));

                    LOGGER.log(Level.INFO, "Active code is set to cancelled, New code was generated!");
                    return codesMapper.toDto(codesRepo.save(codesMapper.toEntity(newCodeDto)));
                }
            }


    }
}
