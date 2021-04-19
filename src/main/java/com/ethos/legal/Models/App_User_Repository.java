package com.ethos.legal.Models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface App_User_Repository extends JpaRepository<App_User, Long > {
    public App_User findByUserName(String username);
}
