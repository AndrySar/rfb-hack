package ru.rfb.hack.domain.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CoordinatesDTO {

    private Double lat;
    private Double lon;

    @JsonCreator
    public CoordinatesDTO(@JsonProperty("lat") Double lat, @JsonProperty("lon") Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
