package com.example.springBootRabbitmq.rabbit.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class TopReceiver {

    Logger logger  = LoggerFactory.getLogger(TopReceiver.class);

    @RabbitHandler
    public void process(String message){
        logger.info(">>Topic receiver1: " + message);
    }
}
