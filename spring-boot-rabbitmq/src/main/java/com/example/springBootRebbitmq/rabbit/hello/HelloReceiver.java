package com.example.springBootRebbitmq.rabbit.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="hello")
public class HelloReceiver {
    private static final Logger logger = LoggerFactory.getLogger(HelloReceiver.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitHandler
    public void process(String hello){
        logger.info("Receiver: " + hello);
    }

}
