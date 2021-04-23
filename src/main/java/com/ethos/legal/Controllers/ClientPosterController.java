package com.ethos.legal.Controllers;


import com.ethos.legal.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class ClientPosterController {

    @Autowired
    BidRepository bidRepository;

    @Autowired
    JobPostRepository jobPostRepository;

    @Autowired
    App_User_Repository app_user_repository;

    @GetMapping("/postMaker")
    public String jobPoster(Principal principal, Model m) {



        App_User appUser = app_user_repository.findByEmail(principal.getName());
        m.addAttribute("principal", principal);
        m.addAttribute("appUser", appUser);
        return "clientPoster.html";
    }

    @PostMapping("/makePost")
    public RedirectView makePost(String jobTitle, String dateToComplete, String datePosted, String description, String serviceType, Principal principal){
//        System.out.println("dateP: " + datePosted.format(datePosted));
        JobPost jobPost = new JobPost(jobTitle,dateToComplete, datePosted, description, serviceType);
        jobPostRepository.save(jobPost);
        App_User app_user = app_user_repository.findByEmail(principal.getName());
        System.out.println(principal.getName());
        app_user.getJobPost().add(jobPost);
        app_user_repository.save(app_user);
        System.out.println(dateToComplete);
        return new RedirectView("/jobs");
    }

    @PostMapping("/postBid")
    public RedirectView bidPoster(String pricePerHour, String jobId, Principal principal){
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        Bid bid = new Bid(pricePerHour, principal.getName(), ts, jobId);

        bidRepository.save(bid);
        App_User appUser = app_user_repository.findByEmail(principal.getName());
        appUser.getBid().add(bid);
        app_user_repository.save(appUser);

        long longJobId = Long.parseLong(jobId);
        JobPost jobPost = jobPostRepository.findById(longJobId);
        jobPost.getBid().add(bid);

        jobPostRepository.save(jobPost);
        return new RedirectView("/jobs");
    }





}
