package com.xworkz.collection.runner;

import com.xworkz.collection.dto.ApplianceDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ApplianceRunner {
    public static void main(String[] args) {
        ApplianceDTO appliance1 = new ApplianceDTO("Refrigerator", "LG", 28000, 2, true);
        ApplianceDTO appliance2 = new ApplianceDTO("Washing Machine", "Samsung", 22000, 3, true);
        ApplianceDTO appliance3 = new ApplianceDTO("Microwave Oven", "IFB", 9500, 1, false);
        ApplianceDTO appliance4 = new ApplianceDTO("Air Conditioner", "Voltas", 32000, 2, true);
        ApplianceDTO appliance5 = new ApplianceDTO("Ceiling Fan", "Havells", 2200, 2, true);
        ApplianceDTO appliance6 = new ApplianceDTO("Geyser", "Bajaj", 7000, 1, false);
        ApplianceDTO appliance7 = new ApplianceDTO("Mixer Grinder", "Prestige", 4200, 2, false);
        ApplianceDTO appliance8 = new ApplianceDTO("Water Purifier", "Kent", 12500, 3, true);
        ApplianceDTO appliance9 = new ApplianceDTO("Induction Stove", "Pigeon", 2800, 1, true);
        ApplianceDTO appliance10 = new ApplianceDTO("Television", "Sony", 40000, 3, true);

        Collection<ApplianceDTO> appliances = new ArrayList<>();
        appliances.add(appliance1);
        appliances.add(appliance2);
        appliances.add(appliance3);
        appliances.add(appliance4);
        appliances.add(appliance5);
        appliances.add(appliance6);
        appliances.add(appliance7);
        appliances.add(appliance8);
        appliances.add(appliance9);
        appliances.add(appliance10);

        for (ApplianceDTO dto : appliances) {
            System.out.println(dto.getName() + "," +
                    dto.getBrand() + "," +
                    dto.getPrice() + "," +
                    dto.getWarrantyInYears() + " years," +
                    dto.isEnergyEfficient());
        }
    }
}
