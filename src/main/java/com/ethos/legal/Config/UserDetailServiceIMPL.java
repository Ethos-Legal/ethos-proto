package com.ethos.legal.Config;

import com.ethos.legal.Models.App_User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDetailServiceIMPL implements UserDetailsService {
    @Autowired
    App_User_Repository app_user_repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return app_user_repository.findByUsername(username);
    }
}
