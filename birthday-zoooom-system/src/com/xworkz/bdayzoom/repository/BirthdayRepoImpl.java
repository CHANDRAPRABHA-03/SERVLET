package com.xworkz.bdayzoom.repository;

import com.xworkz.bdayzoom.constant.DBProperties;
import com.xworkz.bdayzoom.dto.BirthdayDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

public class BirthdayRepoImpl implements BirthdayRepo{

    @Override
    public boolean persist(BirthdayDto birthdayDto) {
        System.out.println("Running persist in BirthdayRepoImpl");
        if(birthdayDto!=null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
                String preSql = "insert into birthday values(?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(preSql);
                preparedStatement.setInt(1, 0);
                preparedStatement.setString(2, birthdayDto.getPerson_name());
                preparedStatement.setDate(3, Date.valueOf(birthdayDto.getEvent_date()));
                preparedStatement.setString(4, birthdayDto.getLocation());
                preparedStatement.setLong(5, birthdayDto.getContact());
                preparedStatement.setString(6, birthdayDto.getRelation());
                preparedStatement.setString(7, birthdayDto.getCake_info());
                preparedStatement.executeUpdate();

            }
            catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getMessage());
            }
        return true;
        }
        return false;
    }
    @SneakyThrows
@Override
public Optional<BirthdayDto> findById(int id) {
        System.out.println("Running findById in BirthdayRepoImpl");

        Class.forName("com.mysql.cj.jdbc.Driver");
        String findByIdSQL = "SELECT * FROM birthday WHERE birthday_id = ?";


        try (Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
            PreparedStatement preparedStatement = connection.prepareStatement(findByIdSQL);)
            {
                System.out.println("findById:" + findByIdSQL);
                preparedStatement.setInt(1,id);
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println("resultSet:" + resultSet);

                while (resultSet.next()) {
                    int pk = resultSet.getInt("birthday_id");
                    String person_name = resultSet.getString("person_name");
                    LocalDate event_date = resultSet.getDate("event_date").toLocalDate();
                    String location = resultSet.getString("location");
                    Long contact = resultSet.getLong("contact");
                    String relation = resultSet.getString("relation");
                    String cake_info = resultSet.getString("cake_info");

                    BirthdayDto birthdayDto = new BirthdayDto(person_name, event_date, location, contact, relation, cake_info);
                    return Optional.of(birthdayDto);
                }
            }
         catch(SQLException exception)
            {
                System.err.println("SQLEXCEPTION in findById" + exception.getMessage());
            }
            return Optional.empty();
        }
    }

