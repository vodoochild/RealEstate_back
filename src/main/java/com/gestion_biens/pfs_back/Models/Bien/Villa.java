package com.gestion_biens.pfs_back.Models.Bien;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import sun.java2d.Surface;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Villa extends Bien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int nb_etages;
    private double surface_jardin;
    private double surface_garage;

}
