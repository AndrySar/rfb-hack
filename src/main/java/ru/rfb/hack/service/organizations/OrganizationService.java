package ru.rfb.hack.service.organizations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.rfb.hack.converter.CoordinatesConverter;
import ru.rfb.hack.domain.dto.CoordinatesDTO;
import ru.rfb.hack.domain.entity.Organization;
import ru.rfb.hack.domain.model.Coordinate;
import ru.rfb.hack.repository.JdbcOrganizationRepository;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class OrganizationService {

    private final static Logger log = LoggerFactory.getLogger(OrganizationService.class);

    private JdbcOrganizationRepository organizationRepository;

    public OrganizationService(JdbcOrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public List<Organization> getOrganizations(CoordinatesDTO coordinates, List<String> categories) {
        if (isCoordinatesNull(coordinates)) {
            log.warn("Coordinates is null");
            return Collections.emptyList();
        }

        Coordinate coordinatesAbove = CoordinatesConverter.convertToAbove(coordinates);
        Coordinate coordinatesBelow = CoordinatesConverter.convertToBelow(coordinates);

        if (Objects.nonNull(categories) && !categories.isEmpty()) {
            return getOrganizationsByCoordinatesAndCategories(coordinatesAbove, coordinatesBelow, categories);
        } else {
            return getOrganizationsByCoordinates(coordinatesAbove, coordinatesBelow);
        }
    }

    private List<Organization> getOrganizationsByCoordinates(Coordinate coordinatesAbove, Coordinate coordinatesBelow) {
        return organizationRepository.findOrganizationsByCoordinates(coordinatesAbove, coordinatesBelow);
    }

    private List<Organization> getOrganizationsByCoordinatesAndCategories(Coordinate coordinatesAbove, Coordinate coordinatesBelow, List<String> categories) {
        return organizationRepository.findOrganizationsByCoordinatesAndCategories(categories, coordinatesAbove, coordinatesBelow);
    }

    private boolean isCoordinatesNull(CoordinatesDTO coordinates) {
        if (Objects.isNull(coordinates) &&
            (Objects.isNull(coordinates.getLat()) || Objects.isNull(coordinates.getLon()))) {
            return true;
        }
        return false;
    }
}
