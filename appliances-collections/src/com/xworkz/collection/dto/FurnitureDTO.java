package com.xworkz.collection.dto;

public class FurnitureDTO {

    private String name;
    private String brand;
    private double price;
    private String material;
    private boolean isFoldable;

    public FurnitureDTO(String name, String brand, double price, String material, boolean isFoldable) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.isFoldable = isFoldable;
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

    public String getMaterial() {
        return material;
    }

    public boolean isFoldable() {
        return isFoldable;
    }
}
