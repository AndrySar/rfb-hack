package ru.rfb.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.rfb.hack.jobs.rabbitmq.producers.RabbitMqProducer;

@RestController
public class RabbitMqController {

    private RabbitMqProducer rabbitMqProducer;

    @Autowired
    public void RabbitMqController(RabbitMqProducer rabbitMqProducer) {
        this.rabbitMqProducer = rabbitMqProducer;
    }

    @RequestMapping(path = "/message/publish", method = RequestMethod.POST)
    public void publish(@RequestBody String message) {
        rabbitMqProducer.publish(message);
    }
}
