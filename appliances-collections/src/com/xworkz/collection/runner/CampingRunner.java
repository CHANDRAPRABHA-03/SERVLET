package com.xworkz.collection.runner;

import com.xworkz.collection.dto.CampingDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CampingRunner {
    public static void main(String[] args) {
        CampingDTO campingDTO1 = new CampingDTO("Tent","Safari",2500,2,true);
        CampingDTO campingDTO2 = new CampingDTO("Sleeping Bag","Wildcraft",1800.50,1,true);
        CampingDTO campingDTO3 = new CampingDTO("Multi-tool Knife", "GaneshTools", 999, 3, true);
        CampingDTO campingDTO4 = new CampingDTO("Solar Power Bank", "Ambrane", 1299, 2, false);
        CampingDTO campingDTO5 = new CampingDTO("Camping Stove", "Borosil", 1450, 2, true);
        CampingDTO campingDTO6 = new CampingDTO("LED Lantern", "Eveready", 699, 1, false);
        CampingDTO campingDTO7 = new CampingDTO("Thermal Blanket", "Kosha", 850, 1, true);
        CampingDTO campingDTO8 = new CampingDTO("Hiking Pole", "TrekMate", 1100, 2, false);
        CampingDTO campingDTO9 = new CampingDTO("Water Filter", "TataSwach", 1350, 3, true);
        CampingDTO campingDTO10 = new CampingDTO("Rain Jacket", "DecathlonIndia", 999, 2, true);

        Collection<CampingDTO> collection = new ArrayList<>();
        collection.add(campingDTO1);
        collection.add(campingDTO2);
        collection.add(campingDTO3);
        collection.add(campingDTO4);
        collection.add(campingDTO5);
        collection.add(campingDTO6);
        collection.add(campingDTO7);
        collection.add(campingDTO8);
        collection.add(campingDTO9);
        collection.add(campingDTO10);

        for (CampingDTO campingDTO:collection){
            System.out.println(campingDTO.getName()+","+campingDTO.getBrand()+","+campingDTO.getPrice()+","+campingDTO.getWarrantyInYears()+","+campingDTO.isDurable());
        }
    }
}
