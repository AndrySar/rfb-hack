package ru.rfb.hack.domain.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlacementDTO {

    private String lat;
    private String lon;
    private String openDate;
    private Integer openTime;
    private Integer closeTime;
    private Integer square;
    private String visibility;
    private String entryConvenience;

    @JsonCreator
    public PlacementDTO(@JsonProperty("lat") String lat,
                        @JsonProperty("lon") String lon,
                        @JsonProperty("openDate") String openDate,
                        @JsonProperty("openTime") Integer openTime,
                        @JsonProperty("closeTime") Integer closeTime,
                        @JsonProperty("square") Integer square,
                        @JsonProperty("visibility") String visibility,
                        @JsonProperty("entryConvenience") String entryConvenience) {
        this.lat = lat;
        this.lon = lon;
        this.openDate = openDate;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.square = square;
        this.visibility = visibility;
        this.entryConvenience = entryConvenience;
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

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getEntryConvenience() {
        return entryConvenience;
    }

    public void setEntryConvenience(String entryConvenience) {
        this.entryConvenience = entryConvenience;
    }
}
