package ru.rfb.hack.domain.entity;

import java.util.Objects;

public class Organization {

    private String name;
    private String category;
    private String lat;
    private String lon;

    public Organization(String name, String category, String lat, String lon) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(name, that.name) &&
            Objects.equals(category, that.category) &&
            Objects.equals(lat, that.lat) &&
            Objects.equals(lon, that.lon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, lat, lon);
    }

    @Override
    public String toString() {
        return "Organization{" +
            "name='" + name + '\'' +
            ", category='" + category + '\'' +
            ", lat='" + lat + '\'' +
            ", lon='" + lon + '\'' +
            '}';
    }
}
