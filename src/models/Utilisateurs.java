/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import enums.Role;

/**
 *
 * @author User
 */
public class Utilisateurs {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private Role role;
    
    // constructeur complet ici
    public Utilisateurs(int id, String nom, String prenom, String email, String motDePasse, Role role)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }
    
}
