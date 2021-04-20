package com.ethos.legal.Models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface App_User_Repository extends JpaRepository<App_User, Long > {

    UserDetails findByEmail(String email);

}
