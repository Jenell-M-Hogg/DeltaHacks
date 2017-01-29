package com.example.jenell_hogg.environmentfriendlyapp;

/**
 * Created by jenell-hogg on 2017-01-28.
 */

public class AirData {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    private float lat;
    private float lng;
    private int mean;
    private int samples;

    public AirData(String id, float lat, float lng, int avg,  int samples){
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.mean = avg;
        this.samples= samples;
    }

    public void newSample(float measure){
        //Add a new measure to the data

        //Reconstruct the sum
        this.mean = mean*samples;
        this.mean = this.mean + (int)(measure);
        //Increase the number of samples
        samples++;
        this.mean = this.mean/samples;
    }

}
