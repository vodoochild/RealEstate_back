package com.gestion_biens.pfs_back.Models.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Admin extends Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;




/*
    public Admin(Admin a) {
        super(a);

    }*/
}
