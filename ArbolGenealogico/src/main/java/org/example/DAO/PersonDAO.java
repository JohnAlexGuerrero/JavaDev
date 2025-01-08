package org.example.DAO;

import org.example.config.DatabaseConnection;
import org.example.models.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDAO {
    public void createPerson(Person person){
        String sql = "INSERT INTO persons (name, gender) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getGender());
            pstmt.executeUpdate();
            System.out.println("Person created with exit.");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
