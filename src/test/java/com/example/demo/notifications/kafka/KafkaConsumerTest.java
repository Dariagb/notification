package com.example.demo.notifications.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KafkaConsumerTest {

    @Autowired
    private KafkaConsumer kafkaConsumer;

    @Test
    public void testKafkaConsumer() {
        String message = "Test message";
        kafkaConsumer.listen(message);

    }
}