package com.samuel.charles.sails_nfe.infra.security.kafka;

import com.samuel.charles.sails_nfe.utils.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class Consumer {
    private final JsonUtil jsonUtil;


    @KafkaListener(
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.template.default-topic}"
    )
    public void consume(String payload) {
        log.info("Receiving event from {} from default topic", payload);
    }
}
