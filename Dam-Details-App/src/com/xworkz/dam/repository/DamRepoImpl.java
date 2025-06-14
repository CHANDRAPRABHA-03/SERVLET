package com.xworkz.dam.repository;

import com.xworkz.dam.dto.DamDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DamRepoImpl implements DamRepo{
    @lombok.SneakyThrows
    @Override
    public String persist(DamDto damDto) {
        System.out.println("Running persist in DamRepoImpl");
        System.out.println("Should save into db..");
        if(damDto !=null){
            String url="jdbc:mysql://localhost:3306/damdb";
            String username="root";
            String password="Xworkzodc@123";

            //Step1: Load & register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step2:Create the Connection
            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "INSERT INTO Dam VALUES (0, '" + damDto.getName() + "', '" + damDto.getLocation() + "', '" +
                    damDto.getDistrict() + "', " + damDto.getCapacity() + ", " +
                    damDto.getConstructionDate() + ", " + damDto.getHydroElectric() + ")";

            Statement statement =connection.createStatement();
            //step 4: execute the statement
            statement.executeUpdate(sql);
            return "Success";
        }
        return "failed";
    }
}
