package ru.rfb.hack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.rfb.hack.converter.CoordinatesConverter;
import ru.rfb.hack.converter.OrganizationConverter;
import ru.rfb.hack.domain.dto.OrganizationDTO;
import ru.rfb.hack.domain.entity.Organization;
import ru.rfb.hack.domain.model.Coordinate;
import ru.rfb.hack.domain.model.request.OrganizationRequest;
import ru.rfb.hack.domain.model.response.OrganizationResponse;
import ru.rfb.hack.repository.JdbcOrganizationRepository;
import ru.rfb.hack.service.organizations.OrganizationService;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrganizationController {

    private final static Logger log = LoggerFactory.getLogger(OrganizationController.class);

    private OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @RequestMapping(path = "/organizations", method = RequestMethod.POST)
    public OrganizationResponse getOrganizations(@RequestBody OrganizationRequest request) {
        List<Organization> organizations = organizationService.getOrganizations(request.getCoordinates(), request.getCategories());

        List<OrganizationDTO> organizationDTOList = organizations.stream()
            .map(OrganizationConverter::toDTO)
            .collect(Collectors.toList());

        return new OrganizationResponse(organizationDTOList);
    }
}
