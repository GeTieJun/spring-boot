package com.example.springBootRabbitmq.rabbit.Fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.a")
public class FanoutReceiverA {

    Logger logger = LoggerFactory.getLogger(FanoutReceiverA.class);

    @RabbitHandler
    public void receiverMessage(String context){
        logger.info(">> receiver message A is: {}", context );
    }
}
