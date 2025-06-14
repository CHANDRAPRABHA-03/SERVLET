package com.xworkz.dam.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DamDto implements Serializable {

    private String name;
    private String location;
    private String district;
//    private int zip;
    private LocalDate constructionDate;
    private int capacity;
    private boolean hydroElectric;

    public DamDto(String name, String location, String district, LocalDate constructionDate, int capacity, boolean hydroElectric) {
        this.name = name;
        this.location = location;
        this.district = district;
//        this.zip = zip;
        this.constructionDate = constructionDate;
        this.capacity = capacity;
        this.hydroElectric = hydroElectric;
    }

    @Override
    public String toString() {
        return "DamDto{" +
                "name='" + name + '\'' +
                ", location ='" + location + '\'' +
                ",district = '" + district + '\'' +
//                ",zip='" + zip + '\'' +
                ",constructionDate='" + constructionDate + '\'' +
                ",capacity='" + capacity + '\'' +
                ",hydroElectric='" + hydroElectric + '\'' +
                '}';
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
    public void setLocation(String location){
        this.location = location;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district){
        this.district = district;
    }
//    public int getZip() {
//        return zip;
//    }
//    public void setZip(int zip){
//        this.zip = zip;
//    }
    public LocalDate getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(LocalDate constructionDate) {
        this.constructionDate = constructionDate;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean getHydroElectric() {
        return hydroElectric;
    }
    public void setHydroElectric(boolean hydroElectric) {
        this.hydroElectric = hydroElectric;
    }
}
