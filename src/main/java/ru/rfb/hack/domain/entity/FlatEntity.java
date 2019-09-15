package ru.rfb.hack.domain.entity;

public class FlatEntity {
    private String lat;
    private String lon;
    private String square;
    private String price;
    private String num;

    public FlatEntity(String lat, String lon, String square, String price, String num) {
        this.lat = lat;
        this.lon = lon;
        this.square = square;
        this.price = price;
        this.num = num;
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

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
