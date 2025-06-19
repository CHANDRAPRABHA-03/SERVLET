package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.dto.BloodDto;
import com.xworkz.bloodbank.repo.BloodRepo;
import com.xworkz.bloodbank.repo.BloodRepoImpl;

import java.util.Optional;

public class BloodServiceImpl implements BloodService {
    @Override
    public boolean save(BloodDto bloodDto) {
        boolean valid = true;
        if (bloodDto == null) {
            System.out.println("DTO returning null");
            valid = false;
        }
        if (bloodDto.getDonarName() == null) {
            System.out.println("Invalid Donar Name");
            valid = false;
        }
        if (bloodDto.getBloodGroup() == null) {
            System.out.println("Invalid BloodGroup");
            valid = false;
        }
        if (bloodDto.getContactNo() <= 0) {
            System.out.println("Invalid Contact");
            valid = false;
        }

        if (bloodDto.getGender() == null) {
            System.out.println("Invalid Gender");
            valid = false;
        }
        if (bloodDto.getDonarAge() <= 0) {
            System.out.println("Invalid Age");
            valid = false;
        }

        if (bloodDto.getLocation() == null) {
            System.out.println("Invalid Location");
            valid = false;
        }
        System.out.println("Data is valid ,will save into db using Repo");
        BloodRepo bloodRepo = new BloodRepoImpl();
        boolean repo = bloodRepo.persist(bloodDto);
        return valid;
    }

    @Override
    public Optional<BloodDto> findById(int id) {
        System.out.println("Running findbyID in bloodServiceImpl");
        if (id > 0) {
            System.out.println("id is valid:" + id);
            BloodRepo bloodRepo = new BloodRepoImpl();
            return bloodRepo.findById(id);
        }
        return BloodService.super.findById(id);
    }
}
