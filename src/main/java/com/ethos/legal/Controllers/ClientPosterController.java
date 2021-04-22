package com.ethos.legal.Controllers;


import com.ethos.legal.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
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
    public RedirectView makePost(String jobTitle, String dateToComplete, String datePosted, String description, String serviceType){
//        System.out.println("dateP: " + datePosted.format(datePosted));
        JobPost jobPost = new JobPost(jobTitle,dateToComplete, datePosted, description, serviceType);
        jobPostRepository.save(jobPost);
        System.out.println(dateToComplete);
        return new RedirectView("/jobs");
    }

    @PostMapping("/postBid")
    public RedirectView bidPoster(String pricePerHour){
        Bid bid = new Bid(pricePerHour);

        bidRepository.save(bid);
        System.out.println(pricePerHour);
        return new RedirectView("/jobs");
    }





}
