package com.gestion_biens.pfs_back.Models.Bien;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
public class Photo implements Serializable {

    @Id @GeneratedValue
    private Long id;

    private String url_img;
}
