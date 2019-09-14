package ru.rfb.hack.client.predict;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.rfb.hack.domain.dto.OrganizationDTO;

import java.io.IOException;

@Service
public class PredictClient {
    private final RestTemplate restTemplate;
    private static final String BASE_URL = "http://localhost:5000";

    public PredictClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public OrganizationDTO getOrganizationDTO() {
        String str = restTemplate.getForObject(BASE_URL + "/get-organizations", String.class);
        System.out.println(str);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(str, OrganizationDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
