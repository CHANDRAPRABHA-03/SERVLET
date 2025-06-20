package com.xworkz.bdayzoom.service;

import com.xworkz.bdayzoom.dto.BirthdayDto;

import java.util.Optional;

public interface BirthdayService {
    boolean save(BirthdayDto birthdayDto);

    default Optional<BirthdayDto> findById(int id)
    {
        return Optional.empty();
    }
}
