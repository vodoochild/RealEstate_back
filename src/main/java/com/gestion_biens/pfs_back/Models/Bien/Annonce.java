package com.gestion_biens.pfs_back.Models.Bien;

import com.gestion_biens.pfs_back.Models.user.Agent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date_publication;
    private String date_disponibilite;
    private String titre;
    private String etat;
    private String type_annonce;

    @ManyToOne
    @JoinColumn(name = "Agent_id")
    private Agent agent;

    @OneToOne
    private Bien bien;

    public double calculerCommission(Bien b){
        return b.getPrix()*b.getPourcentage_commission()/100;

    }

}
