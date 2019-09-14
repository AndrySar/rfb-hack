package ru.rfb.hack.domain.model.response;

public class OrganizationResponse {

    private String name;
    private String category;
    private String lat;
    private String lon;

    public OrganizationResponse(String name, String category, String lat, String lon) {
        this.name = name;
        this.category = category;
        this.lat = lat;
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
