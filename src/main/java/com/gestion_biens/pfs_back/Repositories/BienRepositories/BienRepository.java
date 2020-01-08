package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BienRepository extends JpaRepository<Proprietaire,Long> {
    @Query("DELETE FROM Bien b WHERE annonce_id = ?1")
    void delete_bien_by_Annonce_id(Long annonce_id);
}
