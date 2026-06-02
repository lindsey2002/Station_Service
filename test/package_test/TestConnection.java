/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_test;
import dao.UtilisateurDao;
import models.Utilisateurs;

/**
 *
 * @author User
 */
public class TestConnection {
    public static void main(String[] args){
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        
        System.out.println("-- test de la connexion --");
        
        String emailTest = "pompiste@station.com";
        String password = "pass123";
        
        Utilisateurs user = utilisateurDao.login(emailTest, password);
        
        if(user != null){
            System.out.println("connexion réussie");
            System.out.println("bienvenue : "+ user.getPrenom()+ " "+ user.getNom());
            System.out.println("votre role est "+ user.getRole());
        }else{
            System.out.println("ecec de la connexion.. identifiants invalide");
        }
    }
}
