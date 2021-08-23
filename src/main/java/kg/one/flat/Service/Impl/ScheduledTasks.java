package kg.one.flat.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private LoginProcessServiceImpl loginProcessService;

    @Scheduled(cron = "0/30 * * * * *")
    public void CleanUpTheLoginProcess(){
        loginProcessService.scheduleFixedDelayTask();
    }
}
