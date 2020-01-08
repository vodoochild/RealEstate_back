package com.gestion_biens.pfs_back.Controllers.BienControllers;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import com.gestion_biens.pfs_back.Services.BienServices.AnnonceService;
import com.gestion_biens.pfs_back.Services.UserSrevices.AgentService;
import com.gestion_biens.pfs_back.Services.UserSrevices.ProprietaireService;
import com.gestion_biens.pfs_back.Services.UserSrevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sun.management.resources.agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.IanaLinkRelations.TAG;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/annonce" )
public class AnnonceController {
    @Autowired
    UserService userService;
    @Autowired
    AnnonceService annonceService;

    @Autowired
    AgentService agentService;
    @Autowired
    ProprietaireService proprietaireService;
public AnnonceController( AnnonceService annonceService,ProprietaireService proprietaireService){
    this.annonceService=annonceService;
    this.proprietaireService=proprietaireService;
}
    @RequestMapping("saveAnnonce")
    public void saveAnnonce(@RequestBody Annonce annonce){
        annonceService.saveAnnonce(annonce);


    }
    @RequestMapping(value = "DeleteAnnonce/{id}")
    public void deleteAnnonce(@PathVariable("id") Long id)
    {
    annonceService.deleteAnnonce(id);
    }

    @RequestMapping("changerEtat")
    public void changerEtatAnnonce(@RequestParam("id-annonce") Long id_annonce, @RequestParam("etat") String etat){
        annonceService.changerEtat(id_annonce, etat);
    }

   @GetMapping("annoncesByAgent/{id}")
    public List<Annonce> getAnnonces(@PathVariable("id") Long id){
    return annonceService.getAnnoncesByAgent(id);
    }

    @GetMapping("allAnnonces")
    public List<Annonce> getAllAnnoces(){
        return annonceService.getAllAnnonces();
    }
}
