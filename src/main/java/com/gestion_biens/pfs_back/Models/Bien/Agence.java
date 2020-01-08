package com.gestion_biens.pfs_back.Models.Bien;

import com.gestion_biens.pfs_back.Models.user.Agent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String numTelephone;

    @OneToOne
    private Adresse adresse;
/*
    @OneToMany(mappedBy = "agence")
    private List<Agent> agents;*/
}
