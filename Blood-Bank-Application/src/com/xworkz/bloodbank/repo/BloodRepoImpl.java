package com.xworkz.bloodbank.repo;

import com.xworkz.bloodbank.constant.DBProperties;
import com.xworkz.bloodbank.dto.BloodDto;

import java.sql.*;
import java.util.Optional;

public class BloodRepoImpl implements BloodRepo {

    @Override
    public boolean persist(BloodDto bloodDto) {
        System.out.println("Running persist in BloodRepoImpl");
        if (bloodDto != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(
                        DBProperties.URL.getProp(),
                        DBProperties.USER_NAME.getProp(),
                        DBProperties.SECRET.getProp()
                );


                String sql = "INSERT INTO blood (donar_name, blood_group, contact_no, donar_age, gender, location) " +
                        "VALUES (?, ?, ?, ?, ?, ?)";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, bloodDto.getDonarName());
                statement.setString(2, bloodDto.getBloodGroup());
                statement.setLong(3, bloodDto.getContactNo());
                statement.setInt(4, bloodDto.getDonarAge());
                statement.setString(5, bloodDto.getGender());
                statement.setString(6, bloodDto.getLocation());

                int rowsAffected = statement.executeUpdate();
                return rowsAffected > 0;

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Exception in persist: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public Optional<BloodDto> findById(int id) {
        System.out.println("Running findById in BloodRepositoryImpl");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    DBProperties.URL.getProp(),
                    DBProperties.USER_NAME.getProp(),
                    DBProperties.SECRET.getProp()
            );


            String findByIdSQL = "SELECT * FROM blood WHERE blood_id = ";
            System.out.println("findById: " + findByIdSQL);

            PreparedStatement statement = connection.prepareStatement(findByIdSQL);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                String donarName = resultSet.getString("donar_name");
                String bloodGroup = resultSet.getString("blood_group");
                Long contactNo = resultSet.getLong("contact_no");
                int donarAge = resultSet.getInt("donar_age");
                String gender = resultSet.getString("gender");
                String location = resultSet.getString("location");

                BloodDto bloodDto = new BloodDto(donarName, bloodGroup, contactNo, donarAge, gender, location);
                return Optional.of(bloodDto);
            }

        } catch (SQLException | ClassNotFoundException exception) {
            System.err.println("SQLException in findById: " + exception.getMessage());
        }

        return Optional.empty();
    }
}
