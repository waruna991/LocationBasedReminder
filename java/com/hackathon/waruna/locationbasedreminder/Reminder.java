package com.hackathon.waruna.locationbasedreminder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by waruna on 7/11/2015.
 */
public class Reminder implements Serializable{
    private int id;
    private String title;
    private String note;
    private String Address;
    private double latitude;
    private double longitude;

    public Reminder(int id, String title, String note, String address, double latitude, double longitude) {
        this.id = id;
        this.title = title;
        this.note = note;
        Address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Reminder(String title, String note, String address, double latitude, double longitude) {
        this.title = title;
        this.note = note;
        Address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Reminder(String title, String note) {
        this.title = title;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
