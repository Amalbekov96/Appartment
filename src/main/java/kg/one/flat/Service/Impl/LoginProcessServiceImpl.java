package kg.one.flat.Service.Impl;

import kg.one.flat.Exceptions.IncorrectCodeException;
import kg.one.flat.Exceptions.UserBlockedException;
import kg.one.flat.Models.Codes;
import kg.one.flat.Models.Dto.*;
import kg.one.flat.Models.Enums.CodeStatus;
import kg.one.flat.Models.Enums.RequestStatus;
import kg.one.flat.Models.LoginProcess;
import kg.one.flat.Models.Mapper.CodesMapper;
import kg.one.flat.Models.Mapper.LoginProcessMapper;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Models.Users;
import kg.one.flat.Repository.LoginProcessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LoginProcessServiceImpl extends BaseServiceImpl<LoginProcess, LoginProcessDto, LoginProcessMapper, LoginProcessRepo> {
    public LoginProcessServiceImpl(LoginProcessRepo repo, LoginProcessMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private FlatsServiceImpl flatsService;

    @Autowired
    private CodesServiceImpl codesService;

    @Autowired
    private BlackListServiceImpl blackListService;

    @Autowired
    private LoginProcessRepo loginProcessRepo;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private LoginProcessMapper loginProcessMapper;
    @Autowired
    private RequestsHistoryServiceImpl requestsHistoryService;
    @Autowired
    private CodesMapper codesMapper;

    public ResponseEntity<?> findAllPostedFlats(Codes code) throws UserBlockedException {


        LocalDateTime leftTime = blackListService.findBlockedByUsers(usersMapper.toDto(code.getUsers()));

        RequestsHistoryDto requestsHistoryDto = new RequestsHistoryDto();
        requestsHistoryDto.setAddDate(LocalDateTime.now());
        requestsHistoryDto.setCodesDto(codesMapper.toDto(code));

        if(leftTime != null) {
                requestsHistoryDto.setStatus(RequestStatus.USER_BLOCKED);
                requestsHistoryService.create(requestsHistoryDto);
                throw new UserBlockedException("Sorry, you are blocked! You will be unblocked after " + leftTime.getHour() + " hours and " + leftTime.getMinute() + " minutes!");
        } else {

                CodesDto codesDto = new CodesDto();

                codesDto = codesService.findByCode(code.getCode());
            if(codesDto != null){
                requestsHistoryDto.setStatus(RequestStatus.USER_ACCESSED);
                codesDto.setStatus(CodeStatus.APPROVED);
                codesService.create(codesDto);
                requestsHistoryService.create(requestsHistoryDto);
                return ResponseEntity.ok(flatsService.findAll());
            } else {

                    LoginProcessDto loginProcessDto = loginProcessMapper.toDto(loginProcessRepo.findByUser(code.getUsers()));
                if(loginProcessDto != null){
                    if (loginProcessDto.getCount() == 1) {
                        requestsHistoryDto.setStatus(RequestStatus.USER_ENTERED_WRONG_PASS);
                        requestsHistoryService.create(requestsHistoryDto);

                        loginProcessDto.setCount(2);
                        loginProcessDto.setStartTime(LocalDateTime.now());
                        loginProcessDto.setEndTime(LocalDateTime.now().plusSeconds(30));
                        loginProcessRepo.save(loginProcessMapper.toEntity(loginProcessDto));
                        throw new IncorrectCodeException("Incorrect code " + code.getCode() + " You have 1 more try!");
                    } else {

                        requestsHistoryDto.setStatus(RequestStatus.USER_PUT_BLACK_LIST);
                        requestsHistoryService.create(requestsHistoryDto);

                        BlackListDto newBlackListUser = new BlackListDto();
                        newBlackListUser.setUser(usersMapper.toDto(code.getUsers()));
                        newBlackListUser.setReason(loginProcessDto.getReason());
                        newBlackListUser.setStartTime(LocalDateTime.now());
                        newBlackListUser.setEndTime(LocalDateTime.now().plusHours(3));
                        blackListService.create(newBlackListUser);
                        loginProcessRepo.deleteById(loginProcessDto.getId());
                        throw new IncorrectCodeException("Incorrect code was entered 3 times, Therefore you are blocked for 3 hours from now on!");
                    }

                } else {

                    requestsHistoryDto.setStatus(RequestStatus.USER_ENTERED_WRONG_PASS);
                    requestsHistoryService.create(requestsHistoryDto);

                    LoginProcessDto newLoginProcess = new LoginProcessDto();
                    newLoginProcess.setUser(usersMapper.toDto(code.getUsers()));
                    newLoginProcess.setCount(1);
                    newLoginProcess.setReason("Incorrect code");
                    newLoginProcess.setStartTime(LocalDateTime.now());
                    newLoginProcess.setEndTime(LocalDateTime.now().plusSeconds(30));
                    loginProcessRepo.save(loginProcessMapper.toEntity(newLoginProcess));
                    throw new IncorrectCodeException("Incorrect code " + code.getCode() + " You have 2 more tries!");
                }

            }
        }
    }

    @Transactional
    public void scheduleFixedDelayTask() {
        loginProcessRepo.deleteAllByEndTimeLessThan(LocalDateTime.now());
    }
}
