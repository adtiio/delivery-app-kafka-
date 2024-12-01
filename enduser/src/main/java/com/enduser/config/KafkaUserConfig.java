package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaUserConfig {

    @KafkaListener(topicPattern = "location-update-topic", groupId = "group-1")
    public void updatedLocation(String value){

        System.out.println(value);
    }
}
