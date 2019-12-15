package com.example.springBootRabbitmq.rabbit.Fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.b")
public class FanoutReceiverB {

    Logger logger = LoggerFactory.getLogger(FanoutReceiverB.class);

    @RabbitHandler
    public void receiver(String context){
        logger.info(">> receiver message B: " + context);
    }
}
