package com.xworkz.dam.service;

import com.xworkz.dam.dto.DamDto;
import com.xworkz.dam.repository.DamRepo;
import com.xworkz.dam.repository.DamRepoImpl;

public class DamServiceImpl implements DamService {

    @Override
    public String save(DamDto damDto) {
        System.out.println("Running save in DamServiceImpl");
        System.err.println("Doing full validation before DB interaction...");

        if (damDto != null) {
            String name = damDto.getName();
            String location = damDto.getLocation();
            String district = damDto.getDistrict();
//            int zip = damDto.getZip();
            int capacity = damDto.getCapacity();
            boolean hydroElectric = damDto.getHydroElectric();

            // Validate name
            if (name != null && name.length() > 0 && name.length() < 100) {
                System.out.println("Name is valid");
            } else {
                System.err.println("Invalid name");
                return "Failed";
            }

            // Validate location
            if (location != null && location.length() > 3 && location.length() < 100) {
                System.out.println("Location is valid");
            } else {
                System.err.println("Invalid location");
                return "Failed";
            }

            // Validate district
            if (district != null && district.length() > 3 && district.length() < 100) {
                System.out.println("District is valid");
            } else {
                System.err.println("Invalid district");
                return "Failed";
            }

//            // Validate zip
//            if (zip >= 500000 && zip <= 600000) { // Indian Pincode format
//                System.out.println("Zip code is valid");
//            } else {
//                System.err.println("Invalid zip code");
//                return "Failed";
//            }

            // Validate capacity
            if (capacity > 0 && capacity < 10000000) {
                System.out.println("Capacity is valid");
            } else {
                System.err.println("Invalid capacity");
                return "Failed";
            }

            // Validate hydroElectric - already a boolean, no check needed unless required
            System.out.println("HydroElectric: " + hydroElectric);

            // Proceed to save
            System.out.println("Validation successful, proceeding to DB save...");
            DamRepo damRepo = new DamRepoImpl();
            return damRepo.persist(damDto);

        } else {
            System.err.println("DamDto is null");
            return "Failed";
        }
    }
}
