package com.gestion_biens.pfs_back.Repositories.UserRepositories;

import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {

    Agent findAgentById(Long id);

}
