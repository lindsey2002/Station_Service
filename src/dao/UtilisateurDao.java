/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import enums.Role;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import models.Utilisateurs;

/**
 *
 * @author User
 */
public class UtilisateurDao {
    public Utilisateurs login(String email, String motDePasse){
        String query = "select * from utilisateurs where email = ? and mot_de_passe = ?";
        
        try (Connection con = DatabaseService.getConnection();
            PreparedStatement stmt = con.prepareStatement(query)){
         
            stmt.setString(1, email);
            stmt.setString(2, motDePasse);
            
            try (ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    Role roleUtilisateur = Role.valueOf(rs.getString("role"));
                    
                    return new Utilisateurs(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("email"),
                        rs.getString("mot_de_passe"),
                        roleUtilisateur
                    );
                }
            }
        }catch(SQLException e){
            System.out.println("Erreur lors de la tentativve de connexion dans Utilisateurdao");
            e.printStackTrace();
        }
        
        return null;
    }
}
