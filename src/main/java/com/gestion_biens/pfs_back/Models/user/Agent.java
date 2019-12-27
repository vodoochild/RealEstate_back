package com.gestion_biens.pfs_back.Models.user;


import com.gestion_biens.pfs_back.Models.Bien.Agence;
import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Agent extends Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy = "agent")
    private List<Annonce> annonces;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
/*
    public Agent(Agent a){
        super(a);
        this.login= a.getLogin();
        this.password=a.getPassword();
        this.agence= a.getAgence();
        this.annonces= a.getAnnonces();

    }*/
}
