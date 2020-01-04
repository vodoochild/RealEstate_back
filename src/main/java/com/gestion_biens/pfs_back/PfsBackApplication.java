package com.gestion_biens.pfs_back;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.Bien.Photo;
import com.gestion_biens.pfs_back.Models.user.Admin;
import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.AnnonceRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AdminRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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

    public static void main(String[] args) {
        SpringApplication.run(PfsBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     annonceRepository.save(new Annonce("titre1","ville","addresse",new Photo("photo1"),new Photo("photos2")));
      /*  Agent agent= new Agent();
        agent.setEmail("agent1@gmail.com");
        agent.setPassword("agent1pass");
        agent.setNom("NomAgent1");
        agent.setPrenom("PrenomAgent1");
        agent.setNum_telephone("0623478951");
        agent.setRole("ROLE_USER");
        agentRepository.save(agent);
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
        adminRepository.save(admin);*/



    }
}
