package com.jdbc.jc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Cat {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String username = "root";
            String password = "Xworkzodc@123";
            String url = "jdbc:mysql://localhost:3306/hostel";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection success: " + connection);
        }
}
