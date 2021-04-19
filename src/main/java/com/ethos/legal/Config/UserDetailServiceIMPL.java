package com.ethos.legal.Config;

import com.ethos.legal.Models.ClientPosterRepository;
import com.ethos.legal.Models.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDetailServiceIMPL implements UserDetailsService {
    @Autowired
    ClientPosterRepository clientPosterRepository;

    @Autowired
    JobSeekerRepository jobSeekerRepository;

    @Override
    public UserDetails loadClientByUserName(String username) throws UsernameNotFoundException{
        return clientPosterRepository.findByUsername(username);
    }
    @Override
    public UserDetails loadJobSeekerByUsername(String username) throws UsernameNotFoundException {
        return jobSeekerRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
