package com.gestion_biens.pfs_back.Controllers.UserControllers;

import com.gestion_biens.pfs_back.Models.user.Admin;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @GetMapping("/admins")
    List<Admin> getAdmins(){
        return adminRepository.findAll();
    }
    @GetMapping("/getadmin/{email}")
    Admin getAdmin(@PathVariable String email){
        return adminRepository.findAdminByEmail(email);
    }

}
