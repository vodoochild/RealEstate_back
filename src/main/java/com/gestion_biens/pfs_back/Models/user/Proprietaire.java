package com.gestion_biens.pfs_back.Models.user;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Proprietaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
