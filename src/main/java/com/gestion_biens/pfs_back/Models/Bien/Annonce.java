package com.gestion_biens.pfs_back.Models.Bien;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String etat;//vente ou location
    private String type_annonce;
    private String ville;
    private String adresse;
    private String code_postal;
    private String date_publication;
    private String date_disponibilite;
   @JsonIgnore

    @ManyToOne
    @JoinColumn(name = "Agent_id")
    private Agent agent;
    @OneToOne(mappedBy = "annonce",fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
//    @JsonManagedReference

    private Bien bien;

    @OneToOne( mappedBy = "annonce",fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private Proprietaire proprietaire;
//    @JsonManagedReference
    @OneToMany(mappedBy = "annonce",fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private Set<Photo> photos ;

    public Annonce(String titre, String ville,String adresse ,Photo... photos){
        this.titre=titre;
        this.ville=ville;
        this.adresse=adresse;
        this.photos= Stream.of(photos).collect(Collectors.toSet());
        this.photos.forEach(x -> x.setAnnonce(this));

}

    public void calculerCommission(Bien b) {
        //  return b.getPrix()*b.getPourcentage_commission()/100;

    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}


