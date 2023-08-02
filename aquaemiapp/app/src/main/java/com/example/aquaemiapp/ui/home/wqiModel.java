package com.example.aquaemiapp.ui.home;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class wqiModel {
    double pH;
    double turbidity;
    double eC;
    double temp;
    double streamflow;
    String name;
    String location;
    LocalDateTime update;

    public wqiModel(double pH, double turbidity, double eC, double temp, double streamflow, String name, String location, LocalDateTime   update) {
        this.pH = pH;
        this.turbidity = turbidity;
        this.eC = eC;
        this.temp = temp;
        this.streamflow = streamflow;
        this.name = name;
        this.location = location;
        this.update = update;
    }
    public wqiModel(JSONObject json) throws JSONException {
         this(Double.valueOf(json.getString("pH")),
                Double.valueOf(json.getString("turbidity")),
                Double.valueOf(json.getString("eC")),
                Double.valueOf(json.getString("temp")),
                Double.valueOf(json.getString("streamflow")),
                json.getString("name"),
                json.getString("location"),
                LocalDateTime.parse(json.getString("update"), DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }

    public double getpH() {
        return pH;
    }

    public void setpH(double pH) {
        this.pH = pH;
    }

    public double getTurbidity() {
        return turbidity;
    }

    public void setTurbidity(double turbidity) {
        this.turbidity = turbidity;
    }

    public double geteC() {
        return eC;
    }

    public void seteC(double eC) {
        this.eC = eC;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getStreamflow() {
        return streamflow;
    }

    public void setStreamflow(double streamflow) {
        this.streamflow = streamflow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }
}
