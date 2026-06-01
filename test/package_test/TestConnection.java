/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_test;
import dao.DatabaseService;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class TestConnection {
    public static void main(String[] args){
        try{
            Connection con = DatabaseService.getConnextion();
            if(con != null){
                System.out.println("Bravo  connexion a la base de donnée validée");
                con.close();
            }
        }catch(Exception e){
            System.out.println("Echec de la connexion..");
            e.printStackTrace();
        }
    }
}
