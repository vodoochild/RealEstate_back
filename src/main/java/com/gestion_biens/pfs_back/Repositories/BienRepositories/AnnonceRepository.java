package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce,Long> {
    @Query(value = "SELECT * from Annonce a WHERE a.agent_id=?1" , nativeQuery = true)
    List<Annonce> findAnnoncesByAgent(Long agent_id);



 /*   @Query("select a.Agent_id from Annonce a where a.id = ?1")
    Long getAnnonceAgent(Long annonce_id);*/

    @Override
    Annonce getOne(Long aLong);

    @Modifying
    @Query("update Annonce a set a.etat = ?2 where a.id = ?1")
    void setEtat(Long id_annonce, String etat);
}
