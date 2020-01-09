package com.gestion_biens.pfs_back.Models.Bien;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue//(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private int nb_pieces;
    private double surface;
    private String description;
    private double prix;
    private double pourcentage_commission;
//    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="annonce_id")
@JsonIgnore
    private Annonce annonce;


}
