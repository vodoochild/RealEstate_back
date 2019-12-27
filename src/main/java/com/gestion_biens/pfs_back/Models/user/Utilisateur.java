package com.gestion_biens.pfs_back.Models.user;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nom;
    private String prenom;
    private String num_telephone;
   /* @OneToOne
    private Login login;*/
   private String email;
   private String password;
   private String role;

/*    public Utilisateur(Utilisateur u){
        this.id= u.id;
        this.nom= u.nom;
        this.prenom=u.prenom;
        *//*this.login=u.login;*//*

    }
    public Utilisateur(String username){
        this.email=username;  }*/
    public Utilisateur(){}

}
