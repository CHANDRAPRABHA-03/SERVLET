package com.xworkz.dam.repository;

import com.xworkz.dam.dto.DamDto;

public interface DamRepo{
    String persist(DamDto damDto);
}
