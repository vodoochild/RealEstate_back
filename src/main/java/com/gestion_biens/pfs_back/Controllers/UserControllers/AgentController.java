package com.gestion_biens.pfs_back.Controllers.UserControllers;

import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/agent")
public class AgentController {

    @Autowired
    AgentRepository agentRepository;

    @GetMapping("/allAgents")
        List<Agent> getAgents(){
        return agentRepository.findAll();
        }
    @GetMapping("/getagent/{email}")
    Agent getAgent(@PathVariable String email){
        return agentRepository.findAgentByEmail(email);
    }
/*
    @GetMapping("getAgent/{id}")
    Agent getAgentAnnonce(@PathVariable Long id){
        return agentRepository.findAgentByAnnonce(id);
    }*/
}
