package com.gestion_biens.pfs_back.Models.Bien;

import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Bien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int nb_pieces;

    private double surface;

    private List<String> photo;

    private String description;

    private double prix;

    private double pourcentage_commission;

    @OneToOne
    private Adresse adresse;

    @OneToOne
    private Proprietaire proprietaire;
}
