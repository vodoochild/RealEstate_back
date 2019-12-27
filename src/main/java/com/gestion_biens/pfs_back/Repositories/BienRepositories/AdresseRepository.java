package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.Bien.Adresse;
import com.gestion_biens.pfs_back.Models.user.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse,Long> {
}
