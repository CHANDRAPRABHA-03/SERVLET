package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDto;

public interface WeatherService {
    boolean save(WeatherDto weatherDto);
}