package com.example.springbootscheduler.scheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchedulerTest {

    @Autowired
    private Timer timer;

    @Test
    public void process(){
        timer.process();
    }
}
