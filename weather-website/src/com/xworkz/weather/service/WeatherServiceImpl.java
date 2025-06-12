package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDto;

public class WeatherServiceImpl implements WeatherService{
    @Override
    public boolean save(WeatherDto weatherDto) {
        if(weatherDto != null){
            String weather = weatherDto.getWeather();
            if(weather.length()>2){
                System.out.println("Valid Weather");
            }else{
                System.out.println("Invalid Weather");
            }
            if (weatherDto.getPlaceName() == null || weatherDto.getPlaceName().isEmpty()) {
                System.out.println("Invalid Place Name");
            }

            if (weatherDto.getWeather() == null || weatherDto.getWeather().length() < 3) {
                System.out.println("Invalid Weather");
            }



            if (weatherDto.getMaxTemp() == null || weatherDto.getMaxTemp().isEmpty()) {
                System.out.println("Max Temp is required");
            }

            if (weatherDto.getCloudy() == null || (!weatherDto.getCloudy().equalsIgnoreCase("Yes") && !weatherDto.getCloudy().equalsIgnoreCase("No"))) {
                System.out.println("Invalid Cloudy field");
            }

            if (weatherDto.getRaining() == null || (!weatherDto.getRaining().equalsIgnoreCase("Yes") && !weatherDto.getRaining().equalsIgnoreCase("No"))) {
                System.out.println("Invalid Raining field");
            }
            if (weatherDto.getHumidity() == null || weatherDto.getHumidity().isEmpty()) {
                System.out.println("Humidity is required");
            }

            if (weatherDto.getWindSpeed() == null || weatherDto.getWindSpeed().isEmpty()) {
                System.out.println("Wind Speed is required");
            }

            if (weatherDto.getSunRiseTime() == null || weatherDto.getSunRiseTime().isEmpty()) {
                System.out.println("SunRise Time is required");
            }

            if (weatherDto.getSunSetTime() == null || weatherDto.getSunSetTime().isEmpty()) {
                System.out.println("SunSet Time is required");
            }

            if (weatherDto.getMoonRiseTime() == null || weatherDto.getMoonRiseTime().isEmpty()) {
                System.out.println("MoonRise Time is required");
            }

            if (weatherDto.getMoonSetTime() == null || weatherDto.getMoonSetTime().isEmpty()) {
                System.out.println("MoonSet Time is required");
            }

            if (weatherDto.getRainStartTime() == null || weatherDto.getRainStartTime().isEmpty()) {
                System.out.println("Rain Start Time is required");
            }

            if (weatherDto.getRainEndTime() == null || weatherDto.getRainEndTime().isEmpty()) {
                System.out.println("Rain End Time is required");
            }

            if (weatherDto.getPrecipitation() == null || weatherDto.getPrecipitation().isEmpty()) {
                System.out.println("Precipitation is required");
            }
            if (weatherDto.getMinTemp() == null || weatherDto.getMinTemp().isEmpty()) {
                System.out.println("Min Temp is required");
            }

        }
        return true;
    }
}