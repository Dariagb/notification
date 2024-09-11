package com.example.demo.notifications.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer
{
    @KafkaListener(topics = "topic1", groupId = "consumer")
    public void listen(String message){
        System.out.println(" Recieved message"+ message);
    }

}

