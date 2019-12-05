package com.example.springBootRabbitmq.rabbit;

import com.example.springBootRabbitmq.rabbit.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicSender topicSender;

    @Test
    public void TopicTest(){
        topicSender.sendMessage1();
    }
}
