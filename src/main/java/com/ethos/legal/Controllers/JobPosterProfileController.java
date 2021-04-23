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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class JobPosterProfileController {

    @Autowired
    App_User_Repository app_user_repository;

    @Autowired
    NotesRepository notesRepository;

    @Autowired
    JobPostRepository jobPostRepository;

    @GetMapping("/JobPosterProfile")
    public String jobPosterProfile(Principal principal, Model m) {

        App_User appUser = app_user_repository.findByEmail(principal.getName());
        System.out.println(appUser.getJobPost().get(0).getNotes().size());
        m.addAttribute("activeJobs", sortActiveJobs(principal));
        m.addAttribute("outstandingJobs", sortOutstandingJobs(principal));
        m.addAttribute("principal", principal);
        m.addAttribute("appUser", appUser);
        return "jobPosterProfile.html";
    }

    @PostMapping("/addNote")
    public RedirectView addNote(Principal principal, String noteText, String jobId) {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        Notes note = new Notes(principal.getName(), noteText, ts);
        notesRepository.save(note);

        JobPost jobPost = jobPostRepository.findById(Long.parseLong(jobId));
        jobPost.getNotes().add(note);

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

    public ArrayList<JobPost> sortOutstandingJobs(Principal principal) {
        ArrayList<JobPost> newArrJobs = new ArrayList<>();
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
