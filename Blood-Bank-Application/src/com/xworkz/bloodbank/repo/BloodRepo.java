package com.xworkz.bloodbank.repo;

import com.xworkz.bloodbank.dto.BloodDto;

import java.util.Optional;

public interface BloodRepo {
    boolean persist (BloodDto bloodDto);

    default Optional<BloodDto> findById(int id){
        return Optional.empty();
    }
}
