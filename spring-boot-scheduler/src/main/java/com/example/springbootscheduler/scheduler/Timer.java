package com.example.springbootscheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    Logger logger = LoggerFactory.getLogger(Timer.class);

    private int count = 1;

    @Scheduled(cron = "* * * * * ?")
    public void process(){
        for(int i = 1; i < 100; i++){
            logger.info("this is scheduler task running : {}", count++ );
        }
    }
}
