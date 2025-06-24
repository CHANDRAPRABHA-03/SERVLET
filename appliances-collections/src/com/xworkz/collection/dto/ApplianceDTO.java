package com.xworkz.collection.dto;

public class ApplianceDTO {

    private String name;
    private String brand;
    private double price;
    private int warrantyInYears;
    private boolean isEnergyEfficient;

    public ApplianceDTO(String name, String brand, double price, int warrantyInYears, boolean isEnergyEfficient) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.warrantyInYears = warrantyInYears;
        this.isEnergyEfficient = isEnergyEfficient;
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

    public int getWarrantyInYears() {
        return warrantyInYears;
    }

    public boolean isEnergyEfficient() {
        return isEnergyEfficient;
    }
}
