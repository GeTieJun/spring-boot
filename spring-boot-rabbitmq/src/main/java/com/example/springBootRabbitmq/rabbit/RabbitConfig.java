package com.example.springBootRabbitmq.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitConfig {

    Logger logger = LoggerFactory.getLogger(RabbitConfig.class);

    @Bean
    public Queue helloQueue(){
        logger.info(">>>>>start reload RabbitConfig helloQueue method");
        return new Queue("hello");
    }

    @Bean
    public Queue neoQueue() {
        return new Queue("neo");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }

}
