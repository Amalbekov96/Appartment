package kg.one.flat.Service.Impl;

import kg.one.flat.Models.BlackList;
import kg.one.flat.Models.Dto.BlackListDto;
import kg.one.flat.Models.Dto.UsersDto;
import kg.one.flat.Models.Mapper.BlackListMapper;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Models.Users;
import kg.one.flat.Repository.BlackListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
@Service
public class BlackListServiceImpl extends BaseServiceImpl<BlackList, BlackListDto, BlackListMapper, BlackListRepo>{
    public BlackListServiceImpl(BlackListRepo repo, BlackListMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private BlackListRepo blackListRepo;
    @Autowired
    private BlackListMapper blackListMapper;
    @Autowired
    private UsersMapper usersMapper;

    public LocalDateTime findBlockedByUsers(UsersDto usersDto){

        BlackListDto blockedUserDto = blackListMapper.toDto(blackListRepo.findByUserAndEndTimeIsAfter(usersMapper.toEntity(usersDto), LocalDateTime.now()));

        if(blockedUserDto == null){
            return null;
        } else {
            int minutes = Math.abs((int) ChronoUnit.MINUTES.between(LocalDateTime.now(), blockedUserDto.getEndTime()));
            int hours = Math.abs((int) ChronoUnit.HOURS.between(LocalDateTime.now(), blockedUserDto.getEndTime()));

            if(minutes > 60){
                minutes = minutes % 60;
            }

            System.out.println(minutes + "   " + hours);
            LocalDateTime leftTime = LocalDateTime.of(2019, 03, 28, hours, minutes, 48, 123456789);
            return leftTime;
        }
    }
}
