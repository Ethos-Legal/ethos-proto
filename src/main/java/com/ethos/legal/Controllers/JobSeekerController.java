package com.ethos.legal.Controllers;

import com.ethos.legal.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class JobSeekerController {

    @Autowired
    App_User_Repository app_user_repository;

    @Autowired
    JobPostRepository jobPostRepository;

    @Autowired
    BidRepository bidRepository;

    @GetMapping("/jobSeeker")
    public String jobPostBoard(Principal principal, Model m) {
        App_User appUser = app_user_repository.findByEmail(principal.getName());
//        if(!appUser.isJobSeeker()) {
//            return "home.html";
//        }
        m.addAttribute("activeJobs", sortActiveJobs(principal));
        m.addAttribute("outstandingBids", sortBids(principal));
        m.addAttribute("principal", principal);
        m.addAttribute("appUser", appUser);
        return "jobSeeker.html";
    }

    @PostMapping("/hire")
    public RedirectView hireForJob(Principal principal, String bidSeeker, String jobId, String bidPrice) {
        long newJobId = Long.parseLong(jobId);
        JobPost jobPost = jobPostRepository.findById(newJobId);
        jobPost.isActive = true;
        jobPost.setJobSeeker(bidSeeker);
        jobPost.setPriceHour(bidPrice);
        System.out.println(jobPost.getPriceHour().getClass());
        jobPostRepository.save(jobPost);


        return new RedirectView("/JobPosterProfile");
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

    public ArrayList<JobPost> sortBids(Principal principal) {
        ArrayList<JobPost> newArrJobs = new ArrayList<>();
        App_User appUser = app_user_repository.findByEmail(principal.getName());

        for(Bid bid : appUser.getBid()) {
            long longJobId = Long.parseLong(bid.getJobId());
            JobPost jobPost = jobPostRepository.findById(longJobId);
            newArrJobs.add(jobPost);
        }
        return newArrJobs;
    }
}


