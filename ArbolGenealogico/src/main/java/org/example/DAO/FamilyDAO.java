package org.example.DAO;

import org.example.config.DatabaseConnection;
import org.example.models.FamilyTree;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FamilyDAO {
    public void createFamily(FamilyTree family){
        String sql = "INSERT INTO family(name) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, family.getNameFamily());
            pstmt.executeUpdate();
            System.out.println("Family created with exit.");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
