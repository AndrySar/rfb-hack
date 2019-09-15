package ru.rfb.hack.domain.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placements")
public class PlacementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lon")
    private String lon;

    @Column(name = "open_date")
    private String openDate;

    @Column(name = "open_time")
    private String openTime;

    @Column(name = "close_time")
    private String closeTime;

    @Column(name = "square")
    private String square;

    @Column(name = "visibility")
    private String visibility;

    @Column(name = "entry_convenience")
    private String entryConvenience;

    @Column(name = "data")
    private String data;

    public PlacementEntity(String lat, String lon, String openDate, String openTime, String closeTime, String square, String visibility, String entryConvenience, String data) {
        this.lat = lat;
        this.lon = lon;
        this.openDate = openDate;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.square = square;
        this.visibility = visibility;
        this.entryConvenience = entryConvenience;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}