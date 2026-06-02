/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DatabaseService {
    private static final String url = "jdbc:mysql://localhost:3306/station_service";
    private static final String user = "root";
    private static final String password = "";
    
    public static Connection getConnection() throws java.sql.SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Pilote JDBC introuvabe !");
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, user, password);
    }
}
