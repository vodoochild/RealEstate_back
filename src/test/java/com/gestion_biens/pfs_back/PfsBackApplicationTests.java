package com.gestion_biens.pfs_back;

import com.gestion_biens.pfs_back.Models.user.Agent;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AgentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@RunWith(SpringRunner.class)
@DataJpaTest
class PfsBackApplicationTests {

   /* @Test
    void contextLoads() {
    }*/

    @Autowired
    private AgentRepository agentRepository;

    @Test
    public void testSaveAndGetEmployee() {

       /* Agent agent = new Agent();
        agent.setPassword("admin");
        agent.setLogin("admin@gmail.com");
        agentRepository.save(agent);
        Agent employee2 = agentRepository.findAgentByLogin("admin@gmail.com");
        assertNotNull(employee2);
        assertEquals(employee2.getLogin(), agent.getLogin());
        assertEquals(employee2.getId(), employee2.getId());*/
    }


    @Test
    public void testDeleteEmployee() {
    /*    Agent agent = new Agent();
        agent.setPassword("agent");
        agent.setLogin("agent@gmail.com");
        agentRepository.save(agent);
        agentRepository.delete(agent);*/
    }

    @Test
    public void findAllEmployees() {/*
        Agent agent = new Agent();
        agent.setPassword("agent1");
        agent.setLogin("agent1@gmail.com");
        agentRepository.save(agent);
        assertNotNull(agentRepository.findAll());*/
    }

    @Test
    public void deletByEmployeeIdTest() {
       /* Agent agent = new Agent();
        agent.setPassword("agent2");
        agent.setLogin("agent2@gmail.com");
        Agent emp = agentRepository.save(agent);
        agentRepository.deleteById(emp.getId());*/
    }

}
