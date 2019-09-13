package ru.rfb.hack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final static Logger log = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/")
    public String healthCheck() {
        log.info("Health check Ok;");
        return "Ok;";
    }
}
