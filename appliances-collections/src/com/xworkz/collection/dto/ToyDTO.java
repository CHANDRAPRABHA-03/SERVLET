package com.xworkz.collection.dto;

public class ToyDTO {
    private String name;
    private String brand;
    private double price;
    private String type;
    private boolean isBatteryOperated;

    public ToyDTO(String name, String brand, double price, String type, boolean isBatteryOperated) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.isBatteryOperated = isBatteryOperated;
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

    public String getType() {
        return type;
    }

    public boolean isBatteryOperated() {
        return isBatteryOperated;
    }
}
