package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<Utilisateur,Long> {
}
