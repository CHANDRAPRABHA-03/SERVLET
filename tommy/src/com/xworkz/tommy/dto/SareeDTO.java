package com.xworkz.tommy.dto;

public class SareeDTO {
    //occasionType,color,price,material

    private String occasionType;
    private String color;
    private double price;
    private String material;


    public SareeDTO(String occasionType, String color, double price, String material) {
        this.occasionType = occasionType;
        this.color = color;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "SareeDTO{" +
                "occasionType='" + occasionType + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }

    public String getOccasionType() {
        return occasionType;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }
}
