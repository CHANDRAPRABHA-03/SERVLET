package com.xworkz.collection.runner;

import com.xworkz.collection.dto.VehicleDTO;
import java.util.ArrayList;
import java.util.Collection;

        public class VehicleRunner {
            public static void main(String[] args) {
                VehicleDTO vehicle1 = new VehicleDTO("Activa 6G", "Honda", 89000, "Petrol", false);
                VehicleDTO vehicle2 = new VehicleDTO("iQube", "TVS", 125000, "Electric", true);
                VehicleDTO vehicle3 = new VehicleDTO("Splendor Plus", "Hero", 85000, "Petrol", false);
                VehicleDTO vehicle4 = new VehicleDTO("Revolt RV400", "Revolt", 130000, "Electric", true);
                VehicleDTO vehicle5 = new VehicleDTO("Scorpio", "Mahindra", 1650000, "Diesel", false);
                VehicleDTO vehicle6 = new VehicleDTO("Nexon EV", "Tata", 1550000, "Electric", true);
                VehicleDTO vehicle7 = new VehicleDTO("Classic 350", "Royal Enfield", 210000, "Petrol", false);
                VehicleDTO vehicle8 = new VehicleDTO("Ather 450X", "Ather", 145000, "Electric", true);
                VehicleDTO vehicle9 = new VehicleDTO("Verna", "Hyundai", 1400000, "Petrol", false);
                VehicleDTO vehicle10 = new VehicleDTO("eC3", "Citroen", 1350000, "Electric", true);

                Collection<VehicleDTO> vehicleCollection = new ArrayList<>();
                vehicleCollection.add(vehicle1);
                vehicleCollection.add(vehicle2);
                vehicleCollection.add(vehicle3);
                vehicleCollection.add(vehicle4);
                vehicleCollection.add(vehicle5);
                vehicleCollection.add(vehicle6);
                vehicleCollection.add(vehicle7);
                vehicleCollection.add(vehicle8);
                vehicleCollection.add(vehicle9);
                vehicleCollection.add(vehicle10);

                for (VehicleDTO vehicle : vehicleCollection) {
                    System.out.println(vehicle.getName() + "," +
                            vehicle.getBrand() + "," +
                            vehicle.getPrice() + "," +
                            vehicle.getFuelType() + "," +
                            vehicle.isElectric());
                }
            }
        }