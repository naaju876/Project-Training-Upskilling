package com.example.springboot.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;



@Service
public class RabbitMQJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

//    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
//    public void consumeJsonMessage(User user){
//        LOGGER.info(String.format("Received JSON message -> %s", user.toString()));
//    }
}