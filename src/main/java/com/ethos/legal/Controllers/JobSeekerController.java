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
import java.util.List;

@Controller
public class JobSeekerController {

    @Autowired
    App_User_Repository app_user_repository;

    @Autowired
    JobPostRepository jobPostRepository;

    @GetMapping("/jobSeeker")
    public String jobPostBoard(Principal principal, Model m) {
        App_User appUser = app_user_repository.findByEmail(principal.getName());

        m.addAttribute("activeJobs", sortActiveJobs(principal));
        m.addAttribute("outstandingBids", sortOutstandingBids(principal));
        m.addAttribute("principal", principal);
        m.addAttribute("appUser", appUser);
        return "jobSeeker.html";
    }

    public ArrayList<JobPost> sortActiveJobs(Principal principal) {
        ArrayList<JobPost> newArrJobs = new ArrayList<>();
        App_User appUser = app_user_repository.findByEmail(principal.getName());
        List<JobPost> activeJobs = appUser.getJobPost();

        for(JobPost job : activeJobs) {
            if(job.isActive()) {
                newArrJobs.add(job);
            }
        }
        return newArrJobs;
    }

    public ArrayList<JobPost> sortOutstandingBids(Principal principal) {
        ArrayList<Bid> newArrBid = new ArrayList<>();
        App_User appUser = app_user_repository.findByEmail(principal.getName());
        List<JobPost> activeJobs = appUser.getJobPost();

        for(JobPost job : activeJobs) {
            if(!job.isActive()) {
                newArrJobs.add(job);
            }
        }
        return newArrJobs;
    }
}


