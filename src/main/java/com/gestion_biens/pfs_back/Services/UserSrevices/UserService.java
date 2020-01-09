package com.gestion_biens.pfs_back.Services.UserSrevices;

import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.UtilisateurRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UtilisateurRepository utilisateurRepository;

public void saveUser(Utilisateur user){
    utilisateurRepository.save(user);
}
}
