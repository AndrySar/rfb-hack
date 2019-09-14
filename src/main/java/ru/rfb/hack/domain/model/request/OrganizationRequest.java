package ru.rfb.hack.domain.model.request;

import ru.rfb.hack.domain.dto.CoordinatesDTO;

import java.util.List;

public class OrganizationRequest {

    private CoordinatesDTO coordinates;
    private List<String> categories;

    public OrganizationRequest(CoordinatesDTO coordinates, List<String> categories) {
        this.coordinates = coordinates;
        this.categories = categories;
    }

    public CoordinatesDTO getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(CoordinatesDTO coordinates) {
        this.coordinates = coordinates;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}

