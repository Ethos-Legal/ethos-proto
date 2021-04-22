package com.ethos.legal.Controllers;

import com.ethos.legal.Models.App_User;
import com.ethos.legal.Models.App_User_Repository;
import com.ethos.legal.Models.JobPost;
import com.ethos.legal.Models.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.ArrayList;

@Controller
public class PostBoardController {
    @Autowired
    App_User_Repository app_user_repository;

    @Autowired
    JobPostRepository jobPostRepository;

    @GetMapping("/jobs")
    public String jobPostBoard(Principal principal, Model m){

        ArrayList<JobPost> jobPostList = (ArrayList<JobPost>)jobPostRepository.findAll();
        System.out.println(jobPostList);
        App_User appUser = app_user_repository.findByEmail(principal.getName());
        m.addAttribute("Principal", principal);
        m.addAttribute("appUser",appUser);
        m.addAttribute("jobPostList",jobPostList);
        return "jobPostBoard.html";

    }
}
