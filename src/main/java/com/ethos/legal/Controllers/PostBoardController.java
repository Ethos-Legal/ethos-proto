package com.ethos.legal.Controllers;

import com.ethos.legal.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostBoardController {
    @Autowired
    App_User_Repository app_user_repository;

    @Autowired
    JobPostRepository jobPostRepository;

    @GetMapping("/jobs")
    public String jobPostBoard(Principal principal, Model m){

        App_User appUser = app_user_repository.findByEmail(principal.getName());
        m.addAttribute("Principal", principal);
        m.addAttribute("appUser",appUser);
        m.addAttribute("jobPostList", sortJobPosts(principal));
        return "jobPostBoard.html";

    }

    public ArrayList<JobPost> sortJobPosts(Principal principal) {
        ArrayList<JobPost> newJobArr = new ArrayList<>();
        ArrayList<JobPost> jobPostList = (ArrayList<JobPost>)jobPostRepository.findAll();

        for(int i = 0; i < jobPostList.size(); i++ ) {
            System.out.println("this is the first loop");
            newJobArr.add(jobPostList.get(i));
            List<Bid> tempBidArr = jobPostList.get(i).getBid();
            for(int j = 0; j < tempBidArr.size(); j++) {
                System.out.println("this is the second loop");

                if(tempBidArr.get(j).getJobSeeker().equals(principal.getName())) {
                    newJobArr.remove(newJobArr.size() - 1);
                    break;
                }
            }
        }
        return newJobArr;
    }
}
