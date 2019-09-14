package ru.rfb.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.rfb.hack.client.github.GitHubClientService;

@Controller
public class IntegrationController {

    @Autowired
    private GitHubClientService gitHubClientService;

    @GetMapping("/info")
    public String getInfo() {
        return gitHubClientService.getInfo();
    }
}
