package com.gestion_biens.pfs_back.Services.UserSrevices;

import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    @Autowired
    AgentRepository agentRepository;

    public Agent getAgent(Long id){
        return agentRepository.findAgentById(id);
    }
}
