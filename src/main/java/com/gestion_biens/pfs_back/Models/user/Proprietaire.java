package com.gestion_biens.pfs_back.Models.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Proprietaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String email;
    private String tel;
    @OneToOne( fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name="annonce_id")
    @JsonBackReference
    private Annonce annonce;

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }
}
