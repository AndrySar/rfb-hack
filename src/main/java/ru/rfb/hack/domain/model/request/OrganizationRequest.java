package ru.rfb.hack.domain.model.request;

import java.util.Objects;

public class OrganizationRequest {

    private String lat;
    private String lon;

    public OrganizationRequest(String lat, String lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}

