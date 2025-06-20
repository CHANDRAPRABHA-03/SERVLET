package com.xworkz.bdayzoom.repository;

import com.xworkz.bdayzoom.dto.BirthdayDto;

import java.util.Optional;

public interface BirthdayRepo {
    boolean persist (BirthdayDto birthdayDto);

    default Optional<BirthdayDto> findById(int id)
    {
        return Optional.empty();
    }
}
