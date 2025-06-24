package com.xworkz.collection.runner;

import com.xworkz.collection.dto.ToyDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ToyRunner {
    public static void main(String[] args) {
        ToyDTO toy1 = new ToyDTO("Remote Car", "Hamleys", 1200, "Electronic", true);
        ToyDTO toy2 = new ToyDTO("Building Blocks", "LEGO", 2500, "Construction", false);
        ToyDTO toy3 = new ToyDTO("Puzzle Cube", "Funskool", 399, "Puzzle", false);
        ToyDTO toy4 = new ToyDTO("Talking Doll", "Barbie India", 1499, "Doll", true);
        ToyDTO toy5 = new ToyDTO("Train Set", "Toyzone", 899, "Electronic", true);
        ToyDTO toy6 = new ToyDTO("Cricket Set", "Playwell", 650, "Outdoor", false);
        ToyDTO toy7 = new ToyDTO("Board Game", "SmartGames", 999, "Strategy", false);
        ToyDTO toy8 = new ToyDTO("Drum Set", "Musico", 1300, "Musical", true);
        ToyDTO toy9 = new ToyDTO("Stuffed Teddy", "MyBaby", 499, "Soft Toy", false);
        ToyDTO toy10 = new ToyDTO("Robot Dog", "FunSkool", 1800, "Robot", true);

        Collection<ToyDTO> toyCollection = new ArrayList<>();
        toyCollection.add(toy1);
        toyCollection.add(toy2);
        toyCollection.add(toy3);
        toyCollection.add(toy4);
        toyCollection.add(toy5);
        toyCollection.add(toy6);
        toyCollection.add(toy7);
        toyCollection.add(toy8);
        toyCollection.add(toy9);
        toyCollection.add(toy10);

        for (ToyDTO toy : toyCollection) {
            System.out.println(toy.getName() + "," +
                    toy.getBrand() + "," +
                    toy.getPrice() + "," +
                    toy.getType() + "," +
                    toy.isBatteryOperated());
        }
    }
}
