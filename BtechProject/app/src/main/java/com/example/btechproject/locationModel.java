package com.example.btechproject;

public class locationModel {
    private double lat, lng;

    private String comment;

    public locationModel() {
    }

    public locationModel(double lat, double lng, String comment) {
        this.lat = lat;
        this.lng = lng;
        this.comment = comment;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getComment() {
        return comment;
    }

}
