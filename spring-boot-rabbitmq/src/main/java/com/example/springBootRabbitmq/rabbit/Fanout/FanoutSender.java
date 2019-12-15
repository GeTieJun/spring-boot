package com.example.springBootRabbitmq.rabbit.Fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

    Logger logger = LoggerFactory.getLogger(FanoutSender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String context){
        logger.info(">> The Fanout message sending....");
        amqpTemplate.convertAndSend("fanoutExchange", "", context);
    }

}
