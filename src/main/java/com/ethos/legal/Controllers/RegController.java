package com.ethos.legal.Controllers;

import com.ethos.legal.Models.App_User;
import com.ethos.legal.Models.App_User_Repository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
@Controller
public class RegController {
    @Autowired
    App_User_Repository app_user_repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @GetMapping("/reg")
    public String regPage(){
        return ("reg.html");
    }

    @PostMapping("/newUser")
    public RedirectView newRegUser(String email, String credentials, String password,String name,String lawFirm, String lawFirmAddress, String phoneNumber, String linkedInUrl, int age, String description, String jobSeeker, String clientPoster){

        password = passwordEncoder.encode(password);
        App_User newAppUser = new App_User(email, password, name, phoneNumber, linkedInUrl, lawFirm, lawFirmAddress , age,  credentials,  description);

        if (jobSeeker != null){
            newAppUser.setClientPoster(true);
        } else {
            newAppUser.setJobSeeker(true);
        }
        app_user_repository.save(newAppUser);
        return new RedirectView("/");
    }
}
