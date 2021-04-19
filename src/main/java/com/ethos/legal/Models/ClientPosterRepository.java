package com.ethos.legal.Models;

import com.ethos.legal.Models.ClientPoster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientPosterRepository extends JpaRepository<ClientPoster, Long>{
    public ClientPoster findById(int _id);
}
