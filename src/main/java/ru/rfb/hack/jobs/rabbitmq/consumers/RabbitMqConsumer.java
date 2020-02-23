package ru.rfb.hack.jobs.rabbitmq.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static ru.rfb.hack.configuration.RabbitMqConfiguration.QUEUE_NAME;

@EnableRabbit
@Component
public class RabbitMqConsumer {

    private final static Logger log = LoggerFactory.getLogger(RabbitMqConsumer.class);

    @RabbitListener(queues = QUEUE_NAME)
    public void processMessage(String message) {
        log.info("Message from " + QUEUE_NAME + ": " + message);
    }
}
