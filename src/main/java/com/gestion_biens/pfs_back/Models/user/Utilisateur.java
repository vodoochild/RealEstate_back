package com.gestion_biens.pfs_back.Models.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@AllArgsConstructor
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="USER_TYPE")
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
public Utilisateur(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
}
 
}
