package com.example.springBootRabbitmq.rabbit.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    Logger logger = LoggerFactory.getLogger(TopicSender.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendMessage1(){
        String context = "hi, this is a topic message";
        logger.info(">>Topic Sender: " + context);
        rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
    }

    public void sendMessage2(){
        String context = "hi, this is a topic message2";
        logger.info(">>Topic Sender2: " + context);
        rabbitTemplate.convertAndSend("topicExchange1", "message.topic", context);
    }

}
