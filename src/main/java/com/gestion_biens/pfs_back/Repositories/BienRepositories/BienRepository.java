package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienRepository extends JpaRepository<Proprietaire,Long> {
}
