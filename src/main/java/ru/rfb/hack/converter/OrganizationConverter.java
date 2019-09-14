package ru.rfb.hack.converter;

import ru.rfb.hack.domain.dto.OrganizationDTO;
import ru.rfb.hack.domain.entity.Organization;

public class OrganizationConverter {

    public static OrganizationDTO toDTO(Organization organization) {
        return new OrganizationDTO(
            organization.getName(),
            organization.getCategory(),
            Double.valueOf(organization.getLat()),
            Double.valueOf(organization.getLon())
        );
    }
}
