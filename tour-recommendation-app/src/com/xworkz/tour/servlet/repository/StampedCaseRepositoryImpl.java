package com.xworkz.tour.servlet.repository;

import com.sun.jndi.ldap.Connection;
import com.xworkz.tour.servlet.dto.StampedCaseDto;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedCaseRepositoryImpl implements StampedRepo{
    @Override
    public void persist(StampedCaseDto stampedCaseDto) {
        System.out.println("Persist running in stampedDto");
        System.out.println("Should save into DB");
        if(stampedCaseDto != null){
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String username = "root";
            String password = "Xworkzodc@123";

            //Step 1 Load the Driver
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                //Step2 Create the connection
                Connection connection = DriverManager.getConnection(url,username,password);

                //Step3 Prepare the Statement
                String sql = "insert into stamped_case values(0,'"
                        + stampedCaseDto.getEvent()+"',"
                        +stampedCaseDto.getNoOfDeaths()+","
                        +stampedCaseDto.getNoOfInjuries()+",'"
                        +stampedCaseDto.getLocation()+"')";
                Statement statement = connection.createStatement();

                //Step4 execute the statement
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {

            }
            return "Success";
        }
        return "failed";
    }
}