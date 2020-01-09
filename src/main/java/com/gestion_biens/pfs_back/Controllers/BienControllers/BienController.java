package com.gestion_biens.pfs_back.Controllers.BienControllers;

import com.gestion_biens.pfs_back.Models.Bien.Annonce;
import com.gestion_biens.pfs_back.Models.Bien.Bien;
import com.gestion_biens.pfs_back.Repositories.BienRepositories.BienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/bien")
public class BienController {
    @Autowired
    BienRepository bienRepository;

    @GetMapping("allBien")
    public List<Bien> getAllBien(){
        return bienRepository.findAll();
    }

    @GetMapping("/bien/{id}")
    ResponseEntity<?> getBien(@PathVariable Long id){
        Optional<Bien> annonce= bienRepository.findById(id);
        return annonce.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
