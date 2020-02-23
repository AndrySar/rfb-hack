package ru.rfb.hack.jobs.rabbitmq.producers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqProducer {

    private final static Logger log = LoggerFactory.getLogger(RabbitMqProducer.class);

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publish(String message) {
        log.info("Start publish to queue");
        rabbitTemplate.convertAndSend(message);
        log.info("End publish to queue");
    }
}
