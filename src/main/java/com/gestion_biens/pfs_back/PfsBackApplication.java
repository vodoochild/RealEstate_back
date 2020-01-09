package com.gestion_biens.pfs_back;

import com.gestion_biens.pfs_back.Models.Bien.Agence;
import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.Bien.Bien;
import com.gestion_biens.pfs_back.Models.Bien.Photo;
import com.gestion_biens.pfs_back.Models.user.Admin;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.AgenceRepository;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.AnnonceRepository;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.BienRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AdminRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EnableJpaRepositories/*(basePackageClasses = UtilisateurRepository.class)*/
@SpringBootApplication

public class PfsBackApplication implements CommandLineRunner {

    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    AgentRepository agentRepository;
    @Autowired
    AnnonceRepository annonceRepository;

    @Autowired
    AgenceRepository agenceRepository;

    @Autowired
    BienRepository bienRepository;
/*


    @Autowired
    AppartementRepository appartementRepository;


    @Autowired
    GarageRepository garageRepository;

    @Autowired
    MaisonRepository maisonRepository;

    @Autowired
    VillaRepository villaRepository;



*/

    public static void main(String[] args) {
        SpringApplication.run(PfsBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//     annonceRepository.save(new Annonce("titre1","ville","addresse",new Photo("photo1"),new Photo("photos2")));
   Agent agent= new Agent();
        agent.setEmail("agent1@gmail.com");
        agent.setPassword("agent1pass");
        agent.setNom("NomAgent1");
        agent.setPrenom("PrenomAgent1");
        agent.setNum_telephone("0623478951");
        agent.setRole("ROLE_USER");
        agentRepository.save(agent);

        /*
        Agent agent2= new Agent();
        agent2.setEmail("agent2@gmail.com");
        agent2.setPassword("agent2pass");
        agent2.setNom("NomAgent2");
        agent2.setPrenom("PrenomAgent2");
        agent2.setNum_telephone("0652512258");
        agent2.setRole("ROLE_USER");
        agentRepository.save(agent2);
        Admin admin= new Admin();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("adminpass");
        admin.setNom("Nomadmin");
        admin.setPrenom("Prenomadmin");
        admin.setNum_telephone("0658236478");
        admin.setRole("ROLE_ADMIN");
        adminRepository.save(admin);

        Agence agence1= new Agence();
        agence1.setAdresse("adresse de l'agence 1");
        agence1.setEmail("email_agence@gmail.com");
        agence1.setNumTelephone("0652483698");
        List<Agent> agents= new ArrayList<>();
        agents.add(agent);
        agents.add(agent2);
        agence1.setAgents(agents);
        agenceRepository.save(agence1);

        Photo photo=new Photo();


        Annonce annonce1= new Annonce();
        annonce1.setAgent(agent);
        annonce1.setDate_disponibilite("12/02/2003");
        annonce1.setDate_publication(new Date().toString());
        annonce1.setType_annonce("vente");
        annonce1.setTitre("titre de l'annonce 1");
        annonce1.setEtat("cloturé");
//        annonce1.setBien(appartement);
        annonceRepository.save(annonce1);

        Annonce annonce2= new Annonce();
        annonce2.setAgent(agent2);
        annonce2.setDate_disponibilite("12/02/2003");
        annonce2.setDate_publication(new Date().toString());
        annonce2.setType_annonce("location");
        annonce2.setTitre("titre de l'annonce 2");
        annonce2.setEtat("non cloturé");
//        annonce2.setBien(appartement2);
        annonceRepository.save(annonce2);

        Annonce annonce3= new Annonce();
        annonce3.setAgent(agent);
        annonce3.setDate_disponibilite("12/02/2003");
        annonce3.setDate_publication(new Date().toString());
        annonce3.setType_annonce("vente");
        annonce3.setTitre("titre de l'annonce 3");
        annonce3.setEtat("non cloturé");
//        annonce3.setBien(maison);
        annonceRepository.save(annonce3);

        Annonce annonce4= new Annonce();
        annonce4.setAgent(agent);
        annonce4.setDate_disponibilite("12/02/2003");
        annonce4.setDate_publication(new Date().toString());
        annonce4.setType_annonce("vente");
        annonce4.setTitre("titre de l'annonce 4");
        annonce4.setEtat("non cloturé");
//        annonce4.setBien(maison2);
        annonceRepository.save(annonce4);

        Annonce annonce5= new Annonce();
        annonce5.setAgent(agent);
        annonce5.setDate_disponibilite("12/02/2003");
        annonce5.setDate_publication(new Date().toString());
        annonce5.setType_annonce("vente");
        annonce5.setTitre("titre de l'annonce 5");
        annonce5.setEtat("non cloturé");
//        annonce5.setBien(villa);
        annonceRepository.save(annonce4);

        Annonce annonce6= new Annonce();
        annonce6.setAgent(agent);
        annonce6.setDate_disponibilite("12/02/2003");
        annonce6.setDate_publication(new Date().toString());
        annonce6.setType_annonce("vente");
        annonce6.setTitre("titre de l'annonce 6");
        annonce6.setEtat("non cloturé");
//        annonce6.setBien(villa2);
        annonceRepository.save(annonce6);

        Annonce annonce7= new Annonce();
        annonce7.setAgent(agent);
        annonce7.setDate_disponibilite("12/02/2003");
        annonce7.setDate_publication(new Date().toString());
        annonce7.setType_annonce("vente");
        annonce7.setTitre("titre de l'annonce 7");
        annonce7.setEtat("non cloturé");
//        annonce7.setBien(villa3);
        annonceRepository.save(annonce7);*/

/*
    Annonce annonce1= annonceRepository.getOne(9L);
    Annonce annonce2= annonceRepository.getOne(6L);
    Annonce annonce3= annonceRepository.getOne(7L);
    Annonce annonce4= annonceRepository.getOne(8L);
    Annonce annonce5= annonceRepository.getOne(10L);
    Annonce annonce6= annonceRepository.getOne(11L);

     Bien appartement = new Bien();
        appartement.setType("apparetement");
        appartement.setDescription("nbr de chambre et autres specifications");
        appartement.setNb_pieces(3);
        appartement.setPourcentage_commission(0.10);
        appartement.setPrix(1260);
        appartement.setSurface(154.35);
        appartement.setAnnonce(annonce1);
        bienRepository.save(appartement);


       Bien appartement2 = new Bien();
        appartement2.setType("apparetement");
        appartement2.setDescription("nbr de chambre et autres specifications");
        appartement2.setNb_pieces(4);
        appartement2.setPourcentage_commission(0.12);
        appartement2.setPrix(1260);
        appartement2.setSurface(154.35);
        appartement2.setAnnonce(annonce2);
        bienRepository.save(appartement2);

        Bien maison= new Bien();
        maison.setType("maison");
        maison.setDescription("nbr de chambre et autres specifications");
        maison.setNb_pieces(5);
        maison.setPourcentage_commission(0.06);
        maison.setPrix(1260);
        maison.setSurface(154.35);
        maison.setAnnonce(annonce3);
        bienRepository.save(maison);

        Bien maison2= new Bien();
        maison2.setType("maison");
        maison2.setDescription("nbr de chambre et autres specifications");
        maison2.setNb_pieces(9);
        maison2.setPourcentage_commission(0.06);
        maison2.setPrix(1260);
        maison2.setSurface(154.35);
        maison2.setAnnonce(annonce4);
        bienRepository.save(maison2);

        Bien villa= new Bien();
        villa.setType("villa");
        villa.setDescription("nbr de chambre et autres specifications");
        villa.setNb_pieces(10);
        villa.setPourcentage_commission(0.16);
        villa.setPrix(12600);
        villa.setSurface(180.35);
        villa.setAnnonce(annonce5);
        bienRepository.save(villa);

        Bien villa2= new Bien();
        villa2.setType("villa");
        villa2.setDescription("nbr de chambre et autres specifications");
        villa2.setNb_pieces(15);
        villa2.setPourcentage_commission(0.09);
        villa2.setPrix(12960);
        villa2.setSurface(254.35);
villa2.setAnnonce(annonce6);
        bienRepository.save(villa2);*/

     /*   Bien villa3= new Bien();
        villa3.setType("villa");
        villa3.setDescription("nbr de chambre et autres specifications");
        villa3.setNb_pieces(9);
        villa3.setPourcentage_commission(0.1);
        villa3.setPrix(1260);
        villa3.setSurface(154.35);
        villa3.setAnnonce(annonce7);
        bienRepository.save(villa3);*/

   }
}
