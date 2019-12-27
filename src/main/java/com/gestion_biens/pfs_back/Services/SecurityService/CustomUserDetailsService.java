package com.gestion_biens.pfs_back.Services.SecurityService;

import com.gestion_biens.pfs_back.Models.user.SecurityDetails.CustomUserDetails;
import com.gestion_biens.pfs_back.Models.user.Utilisateur;
import com.gestion_biens.pfs_back.Repositories.UserRepositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Utilisateur> user = utilisateurRepository.getByEmail(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return user.map(CustomUserDetails::new).get();
    }
}
