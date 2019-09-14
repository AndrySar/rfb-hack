package ru.rfb.hack.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.rfb.hack.domain.model.request.OrganizationRequest;
import ru.rfb.hack.domain.model.response.OrganizationResponse;

import java.util.List;

@RestController
public class OrganizationController {

    @RequestMapping(path = "/organizations", method = RequestMethod.POST)
    public List<OrganizationResponse> getOrganizations(@RequestBody OrganizationRequest request) {
        return null;
    }
}
