package ru.rfb.hack.client.github;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubClientService {

    private final static Logger log = LoggerFactory.getLogger(GitHubClientService.class);

    private static final String BASE_URL = "https://api.github.com";

    @Autowired
    private RestTemplate restTemplate;

    public String getInfo() {
        String result = restTemplate.getForEntity(BASE_URL, String.class).getBody();
        log.info("Http response {}", result);
        return restTemplate.getForEntity(BASE_URL, String.class).getBody();
    }

    public String getCurrentUser() {
        String result = restTemplate.getForEntity(BASE_URL + "/teams", String.class).getBody();
        log.info("Http response {}", result);
        return restTemplate.getForEntity(BASE_URL, String.class).getBody();
    }
}
