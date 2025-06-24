package com.xworkz.collection.dto;

public class CampingDTO {

        private String name;
        private String brand;
        private double price;
        private int warrantyInYears;
        private boolean isDurable;

        public CampingDTO(String name, String brand,  double price,int warrantyInYears,boolean isDurable) {
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.warrantyInYears = warrantyInYears;
            this.isDurable = isDurable;
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

        public boolean isDurable() {
            return isDurable;
        }
    }


