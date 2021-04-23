package com.ethos.legal.Controllers;

import com.ethos.legal.Models.App_User;
import com.ethos.legal.Models.App_User_Repository;
import com.ethos.legal.Models.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.ArrayList;

@Controller
public class JobPosterProfileController {

    @Autowired
    App_User_Repository app_user_repository;

    @GetMapping("/JobPosterProfile")
    public String JobPosterProfile(Principal principal, Model m) {

//        ArrayList<JobPost> outstandingJobList = (ArrayList<JobPost>)jobPostRepository.findAll();

        App_User appUser = app_user_repository.findByEmail(principal.getName());
        m.addAttribute("principal", principal);
        m.addAttribute("appUser", appUser);
        return "jobPosterProfile.html";
    }

}
