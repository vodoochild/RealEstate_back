package com.gestion_biens.pfs_back.Services.UserSrevices;

import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgentService {

    @Autowired
    AgentRepository agentRepository;

    public Agent getAgent(Long id){
        Agent agent1 = new Agent();
        Optional<Agent> agent = agentRepository.findById(id);
        if(agent.isPresent()){agent1 = agent.get();}
      // return agentRepository.findById(id);
        else if(!agent.isPresent())throw new RuntimeException("agent introuvable !");
        return agent1;
    }

}
