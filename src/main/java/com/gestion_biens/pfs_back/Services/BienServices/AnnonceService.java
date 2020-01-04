package com.gestion_biens.pfs_back.Services.BienServices;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {

    @Autowired
    AnnonceRepository annonceRepository;

    public void saveAnnonce(Annonce a){

        annonceRepository.save(a);
    }

    public List<Annonce> getAnnoncesByAgent(Agent agent){
        return annonceRepository.findAnnoncesByAgent(agent);
    }

    public List<Annonce> getAllAnnonces(){
        return annonceRepository.findAll();
    }

    public void changerEtat(Long id_annonce, String etat){
        annonceRepository.setEtat(id_annonce, etat);
    }
}
