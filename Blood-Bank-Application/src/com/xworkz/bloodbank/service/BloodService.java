package com.xworkz.bloodbank.service;

import com.xworkz.bloodbank.dto.BloodDto;

import java.util.Optional;

public interface BloodService {
    boolean save (BloodDto bloodDto);
    default Optional<BloodDto> findById(int id)
    {
        return Optional.empty();
    }
}

