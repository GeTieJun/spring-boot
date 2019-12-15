package com.example.springBootRabbitmq.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutConfig {

    Logger logger = LoggerFactory.getLogger(FanoutConfig.class);

    private final static String queueA = "fanout.a";

    private final static String queueB = "fanout.b";

    private final static String queueC = "fanout.c";

    private final static String fanoutExchange = "fanoutExchange";

    @Bean
    public Queue queueA(){
        return new Queue(queueA);
    }

    @Bean
    public Queue queueB(){
        return new Queue(queueB);
    }

    @Bean
    public Queue queueC(){
        return new Queue(queueC);
    }

    @Bean
    public FanoutExchange createExchange(){
        return new FanoutExchange(fanoutExchange);
    }

    @Bean
    public Binding bindExchangeA(Queue queueA, FanoutExchange exchange){
        return BindingBuilder.bind(queueA).to(exchange);
    }

    @Bean
    public Binding bindExchangeB(Queue queueB, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queueB).to(fanoutExchange);
    }

    @Bean
    public Binding bindExchangeC(Queue queueC, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queueC).to(fanoutExchange);
    }




}
