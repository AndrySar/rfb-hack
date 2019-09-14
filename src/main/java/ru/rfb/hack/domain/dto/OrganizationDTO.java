package ru.rfb.hack.domain.dto;

public class OrganizationDTO{

    private String name;
    private String category;
    private Double lat;
    private Double lon;

    public OrganizationDTO() {
        super();
    }

    public OrganizationDTO(String name, String category, Double lat, Double lon) {
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
