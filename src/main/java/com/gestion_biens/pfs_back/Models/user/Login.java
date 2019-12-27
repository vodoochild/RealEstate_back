package com.gestion_biens.pfs_back.Models.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public Login(Long id,String email,String pass){
        this.id = id ;
        this.email=email;
        BCryptPasswordEncoder bcr = new BCryptPasswordEncoder();
        pass =(bcr.encode((CharSequence)pass));
        this.password=pass;
    }
}
