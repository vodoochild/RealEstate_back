package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnnonceRepository extends JpaRepository<Annonce,Long> {

    List<Annonce> findAnnoncesByAgent(Agent agent);

    @Modifying
    @Query("update Annonce a set a.etat = ?2 where u.id = ?1")
    void setEtat(Long id_annonce, String etat);
}
