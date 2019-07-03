//package com.example.start;
//
//
//import com.example.start.model.Actor;
//import com.example.start.model.FilmRepository;
//
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//public class JDBCExample {
//
//    public static void main(String[] args) {
//
//        List<Actor> result = new ArrayList<>();
//
//        String SQL_SELECT = "Select * from Actor where actor_id =?";
//
//        // auto close connection and preparedStatement
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:postgresql://127.0.0.1:5432/dvdrental", "postgres", "password");
//             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//
//                long id = resultSet.getLong("actor_id");
//                String name = resultSet.getString("firstName");
//                String lastName  = resultSet.getString("lastName");
//
//                Actor obj = new Actor();
//                obj.setFirstName(name);
//                obj.setActor_id(id);
//                obj.setLastName(lastName);
//
//                // Timestamp -> LocalDateTime
//
//                result.add(obj);
//
//            }
//            result.forEach(x -> System.out.println(x));
//
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//}
