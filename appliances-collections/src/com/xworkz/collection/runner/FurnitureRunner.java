package com.xworkz.collection.runner;

import com.xworkz.collection.dto.FurnitureDTO;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {
        FurnitureDTO furniture1 = new FurnitureDTO("Dining Table", "Godrej Interio", 15000, "Wood", false);
        FurnitureDTO furniture2 = new FurnitureDTO("Office Chair", "Featherlite", 4500, "Plastic", true);
        FurnitureDTO furniture3 = new FurnitureDTO("Sofa Set", "Urban Ladder", 32000, "Fabric", false);
        FurnitureDTO furniture4 = new FurnitureDTO("Bookshelf", "HomeTown", 7000, "Engineered Wood", false);
        FurnitureDTO furniture5 = new FurnitureDTO("Coffee Table", "Nilkamal", 3500, "Glass", false);
        FurnitureDTO furniture6 = new FurnitureDTO("Foldable Bed", "Durian", 12000, "Metal", true);
        FurnitureDTO furniture7 = new FurnitureDTO("TV Unit", "IKEA India", 8000, "Wood", false);
        FurnitureDTO furniture8 = new FurnitureDTO("Study Table", "Wipro Furniture", 6000, "Wood", false);
        FurnitureDTO furniture9 = new FurnitureDTO("Plastic Stool", "Supreme", 450, "Plastic", true);
        FurnitureDTO furniture10 = new FurnitureDTO("Garden Chair", "Cello", 1200, "Plastic", true);

        Collection<FurnitureDTO> furnitureCollection = new ArrayList<>();
        furnitureCollection.add(furniture1);
        furnitureCollection.add(furniture2);
        furnitureCollection.add(furniture3);
        furnitureCollection.add(furniture4);
        furnitureCollection.add(furniture5);
        furnitureCollection.add(furniture6);
        furnitureCollection.add(furniture7);
        furnitureCollection.add(furniture8);
        furnitureCollection.add(furniture9);
        furnitureCollection.add(furniture10);

        for (FurnitureDTO furniture : furnitureCollection) {
            System.out.println(furniture.getName() + "," +
                    furniture.getBrand() + "," +
                    furniture.getPrice() + "," +
                    furniture.getMaterial() + "," +
                    furniture.isFoldable());
        }
    }
}
