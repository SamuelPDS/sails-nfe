package com.samuel.charles.sails_nfe.infra.kafka;

import com.samuel.charles.sails_nfe.model.dto.NFeDTO;
import com.samuel.charles.sails_nfe.utils.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final JsonUtil jsonUtil;

    @Value("${spring.kafka.template.default-topic}")
    private String topic;

    public void send(NFeDTO nfeDTO) {

        String payload = jsonUtil.toJson(nfeDTO);

        log.info("Sending event to topic {}: {}", topic, payload);

        kafkaTemplate.send(topic, payload);

    }
}