package com.gestion_biens.pfs_back.Controllers.BienControllers;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Services.BienServices.AnnonceService;
import com.gestion_biens.pfs_back.Services.UserSrevices.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/annonce")
public class AnnonceController {

    @Autowired
    AnnonceService annonceService;

    @Autowired
    AgentService agentService;

    @PostMapping("saveAnnonce")
    public void saveAnnonce(@RequestBody Annonce annonce){

        annonceService.saveAnnonce(annonce);
    }

    @RequestMapping("changerEtat")
    public void changerEtatAnnonce(@RequestParam("id-annonce") Long id_annonce, @RequestParam("etat") String etat){
        annonceService.changerEtat(id_annonce, etat);
    }

    @GetMapping("annoncesByAgent")
    public List<Annonce> getAnnonces(@RequestParam("id_agent") Long id_agent){
        Agent agent= agentService.getAgent(id_agent);
        return annonceService.getAnnoncesByAgent(agent);
    }

    @GetMapping("allAnnonces")
    public List<Annonce> getAllAnnoces(){
        return annonceService.getAllAnnonces();
    }
}