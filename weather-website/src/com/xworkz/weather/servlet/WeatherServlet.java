package com.xworkz.weather.servlet;

import com.xworkz.weather.dto.WeatherDto;
import com.xworkz.weather.repository.WeatherRepository;
import com.xworkz.weather.repository.WeatherRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;


@WebServlet(urlPatterns = "/weather",loadOnStartup = 1)
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String placeName = req.getParameter("placeName");
        String weather = req.getParameter("weather");
        String minTemp = req.getParameter("minTemp");
        String maxTemp = req.getParameter("maxTemp");
        String cloudy = req.getParameter("cloudy");
        String rainy = req.getParameter("rainy");
        String humidity = req.getParameter("humidity");
        String windSpeed = req.getParameter("windSpeed");
        String sunRiseTime = req.getParameter("sunRiseTime");
        String sunSetTime = req.getParameter("sunSetTime");
        String moonRiseTime = req.getParameter("moonRiseTime");
        String moonSetTime = req.getParameter("moonSetTime");
        String rainStartTime = req.getParameter("rainStartTime");
        String rainEndTime = req.getParameter("rainEndTime");
        String precipitation = req.getParameter("precipitation");

        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setPlaceName(placeName);
        weatherDto.setWeather(weather);

        weatherDto.setMaxTemp(maxTemp);
        weatherDto.setCloudy(cloudy);
        weatherDto.setRaining(rainy);
        weatherDto.setHumidity(humidity);
        weatherDto.setWindSpeed(windSpeed);
        weatherDto.setSunRiseTime(sunRiseTime);
        weatherDto.setSunSetTime(sunSetTime);
        weatherDto.setMoonRiseTime(moonRiseTime);
        weatherDto.setMoonSetTime(moonSetTime);
        weatherDto.setRainStartTime(rainStartTime);
        weatherDto.setRainEndTime(rainEndTime);
        weatherDto.setPrecipitation(precipitation);
        weatherDto.setMinTemp(minTemp);
        weatherDto.setCreatedAt(LocalDateTime.now());


        WeatherRepository weatherRepository = new WeatherRepositoryImpl();
        String result =weatherRepository.persist(weatherDto);
    }
}