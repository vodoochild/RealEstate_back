package com.gestion_biens.pfs_back.Repositories.UserRepositories;

import com.gestion_biens.pfs_back.Models.user.Admin;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    @Override
    List<Admin> findAll();

    Admin findAdminByEmail(String email);
}
