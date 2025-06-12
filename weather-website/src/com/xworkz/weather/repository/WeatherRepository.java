package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;

public interface WeatherRepository {
    String persist(WeatherDto weatherDto);
}