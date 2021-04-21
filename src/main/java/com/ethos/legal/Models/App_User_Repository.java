package com.ethos.legal.Models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface App_User_Repository extends JpaRepository<App_User, Long > {

    App_User findByEmail(String email);

}
