package com.gestion_biens.pfs_back.Services.BienServices;

import com.gestion_biens.pfs_back.Repositories.BienRepositories.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;
            @Query()
            public void findImagesByAnnonce(Long id){}
}
