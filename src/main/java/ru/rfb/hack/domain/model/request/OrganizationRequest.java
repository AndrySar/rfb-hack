package ru.rfb.hack.domain.model.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.rfb.hack.domain.dto.CoordinatesDTO;

import java.util.List;

public class OrganizationRequest {

    private CoordinatesDTO coordinates;
    private List<String> categories;

    @JsonCreator
    public OrganizationRequest(@JsonProperty("coordinates") CoordinatesDTO coordinates, @JsonProperty("categories") List<String> categories) {
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

