package com.example.jenell_hogg.environmentfriendlyapp;

import java.util.Date;

/**
 * Created by jenell-hogg on 2017-01-28.
 */

public class AirMeasurement {
    //Let's make the assumption that we have a set amount of clusters

    Date d;
    String time;
    String pm25;
    String pmavg;
    String Norm;
    String AQ;
    String Wind;
    String WindDir;


    public AirMeasurement(Date d, String time, String pm25, String pmavg, String norm, String AQ, String wind, String windDir) {
        this.d = d;
        this.time = time;
        this.pm25 = pm25;
        this.pmavg = pmavg;
        Norm = norm;
        this.AQ = AQ;
        Wind = wind;
        WindDir = windDir;
    }


    public String getPmavg() {
        return pmavg;
    }

    public void setPmavg(String pmavg) {
        this.pmavg = pmavg;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getNorm() {
        return Norm;
    }

    public void setNorm(String norm) {
        Norm = norm;
    }

    public String getAQ() {
        return AQ;
    }

    public void setAQ(String AQ) {
        this.AQ = AQ;
    }

    public String getWind() {
        return Wind;
    }

    public void setWind(String wind) {
        Wind = wind;
    }

    public String getWindDir() {
        return WindDir;
    }

    public void setWindDir(String windDir) {
        WindDir = windDir;
    }







}
