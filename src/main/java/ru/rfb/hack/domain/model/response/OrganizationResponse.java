package ru.rfb.hack.domain.model.response;

import ru.rfb.hack.domain.dto.OrganizationDTO;

import java.util.List;

public class OrganizationResponse {

    private List<OrganizationDTO> organizations;

    public OrganizationResponse(List<OrganizationDTO> organizations) {
        this.organizations = organizations;
    }

    public List<OrganizationDTO> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<OrganizationDTO> organizations) {
        this.organizations = organizations;
    }
}
