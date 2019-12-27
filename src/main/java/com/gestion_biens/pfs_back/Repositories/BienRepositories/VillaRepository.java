package com.gestion_biens.pfs_back.Repositories.BienRepositories;

import com.gestion_biens.pfs_back.Models.Bien.Villa;
import com.gestion_biens.pfs_back.Models.user.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillaRepository extends JpaRepository<Villa,Long> {
}
