package com.gestion_biens.pfs_back.Models.Bien;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    private String code_postal;
    private String ville;


}
