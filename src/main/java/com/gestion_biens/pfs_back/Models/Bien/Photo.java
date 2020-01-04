package com.gestion_biens.pfs_back.Models.Bien;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
public class Photo implements Serializable {

    @Id @GeneratedValue
    private Long id;
    @Column(columnDefinition = "text")
    private String data;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "annonce_id", nullable = false)
    private Annonce annonce;

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    public Photo(String data) {
        this.data=data;
    }

    public Photo() {
    }
}
