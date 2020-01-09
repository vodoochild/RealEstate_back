package com.gestion_biens.pfs_back.Controllers.BienControllers;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Proprietaire;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.AnnonceRepository;
import com.gestion_biens.pfs_back.Services.BienServices.AnnonceService;
import com.gestion_biens.pfs_back.Services.UserSrevices.AgentService;
import com.gestion_biens.pfs_back.Services.UserSrevices.ProprietaireService;
import com.gestion_biens.pfs_back.Services.UserSrevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.IanaLinkRelations.TAG;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/annonce" )
public class AnnonceController {

    @Autowired
    AnnonceService annonceService;

    @Autowired
    AnnonceRepository annonceRepository;

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

    @GetMapping("/annonce/{id}")
    ResponseEntity<?> getAnnonce(@PathVariable Long id){
        Optional<Annonce> annonce= annonceRepository.findById(id);
        return annonce.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

/*

    @GetMapping("getAgent/{id}")
    Agent getAgentAnnonce(@PathVariable Long id){
        return agentService.getAgent(annonceRepository.getAnnonceAgent(id));
    }
*/

 /*  @GetMapping("/ann/{id}")
    Annonce getAnnoce(@PathVariable Long id){
       return annonceRepository.getOne(id);

   }*/
}
