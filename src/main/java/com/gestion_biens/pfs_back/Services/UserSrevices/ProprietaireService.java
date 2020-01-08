package com.gestion_biens.pfs_back.Services.UserSrevices;

import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.ProprietaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietaireService {
    @Autowired
    ProprietaireRepository proprietaireRepository;
    public void saveAgent(Proprietaire p){
         proprietaireRepository.save(p);
    }
}
