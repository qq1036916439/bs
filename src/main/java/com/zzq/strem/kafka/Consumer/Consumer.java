package com.zzq.strem.kafka.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "app_log")
    public void receive(ConsumerRecord<?, ?> consumer) {
        logger.info("{} - {}:{}\n", consumer.topic(), consumer.key(), consumer.value());
    }
}
