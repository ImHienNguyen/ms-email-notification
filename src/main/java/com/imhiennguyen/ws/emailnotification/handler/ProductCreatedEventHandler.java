package com.imhiennguyen.ws.emailnotification.handler;

import com.imhiennguyen.ws.core.ProductCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "${services.product.kafka.topic.name}")
@Slf4j
public class ProductCreatedEventHandler {

    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent) {
        log.info("Received a new event: {}", productCreatedEvent.getTitle());
    }
}
