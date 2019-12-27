package com.gestion_biens.pfs_back.Repositories.UserRepositories;

import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
    Optional<Utilisateur> getByEmail(String email);
}
