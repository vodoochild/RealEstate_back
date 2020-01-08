package com.gestion_biens.pfs_back.Services.BienServices;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.AnnonceRepository;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.BienRepository;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.PhotoRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.ProprietaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {

    @Autowired
    AnnonceRepository annonceRepository;
    @Autowired
    BienRepository bienRepository;
    @Autowired
    PhotoRepository photoRepository;
    @Autowired
    ProprietaireRepository proprietaireRepository;

    public void saveAnnonce(Annonce a){

        annonceRepository.save(a);
    }
    public void deleteAnnonce(Long annonce_id ){
       /* bienRepository.delete_bien_by_Annonce_id(annonce_id);
        photoRepository.delete_photos_by_Annonce_id(annonce_id);
        proprietaireRepository.delete_prop_by_Annonce_id(annonce_id);*/
        annonceRepository.deleteById(annonce_id);
    }

    public List<Annonce> getAnnoncesByAgent(Long id){

        return annonceRepository.findAnnoncesByAgent(id);
    }

    public List<Annonce> getAllAnnonces(){
        return annonceRepository.findAll();
    }

    public void changerEtat(Long id_annonce, String etat){
        annonceRepository.setEtat(id_annonce, etat);
    }
}
