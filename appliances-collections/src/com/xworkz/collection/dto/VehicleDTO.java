package com.xworkz.collection.dto;

public class VehicleDTO {
    private String name;
    private String brand;
    private double price;
    private String fuelType;
    private boolean isElectric;

    public VehicleDTO(String name, String brand, double price, String fuelType, boolean isElectric) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.fuelType = fuelType;
        this.isElectric = isElectric;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isElectric() {
        return isElectric;
    }
}
