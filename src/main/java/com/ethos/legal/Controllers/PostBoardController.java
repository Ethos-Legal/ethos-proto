package com.ethos.legal.Controllers;

import com.ethos.legal.Models.App_User;
import com.ethos.legal.Models.App_User_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class PostBoardController {
    @Autowired
    App_User_Repository app_user_repository;

    @GetMapping("/jobs")
    public String jobPostBoard(Principal principal, Model m){


        App_User appUser = app_user_repository.findByEmail(principal.getName());
        m.addAttribute("Principal", principal);
        m.addAttribute("appUser",appUser);
        return "jobPostBoard.html";

    }
}
