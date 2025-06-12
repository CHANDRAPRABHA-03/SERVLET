package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class WeatherRepositoryImpl implements WeatherRepository {
    @Override
    public String persist(WeatherDto weatherDto) {
        System.out.println("Persist running in weatherDto");
        System.out.println("Should save into DB");
        if (weatherDto != null) {
            String url = "jdbc:mysql://localhost:3306/weatherdb";
            String username = "root";
            String password = "Xworkzodc@123";

            //Step 1 Load the Driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                //Step2 Create the connection
                Connection connection = DriverManager.getConnection(url, username, password);

                //Step3 Prepare the Statement
                String sql = "insert into weather values(0,'"
                        + weatherDto.getPlaceName() + "','"
                        + weatherDto.getWeather() + "',"
                        + weatherDto.getMaxTemp() + ",'"
                        + weatherDto.getCloudy() + "','"
                        + weatherDto.getRaining() + "',"
                        + weatherDto.getHumidity() + ","
                        + weatherDto.getWindSpeed() + ",'"
                        + weatherDto.getSunRiseTime() + "','"
                        + weatherDto.getSunSetTime() + "','"
                        + weatherDto.getMoonRiseTime() + "','"
                        + weatherDto.getMoonSetTime() + "','"
                        + weatherDto.getRainStartTime() + "','"
                        + weatherDto.getRainEndTime() + "',"
                        + weatherDto.getPrecipitation() + ","
                        + weatherDto.getMinTemp() + ",'"
                        + weatherDto.getCreatedAt() + "')";


                Statement statement = connection.createStatement();

//                Step4 execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return "Success";
    }
}