package com.ethos.legal.Controllers;


import com.ethos.legal.Models.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
    public class JobSeekerController {

        @Autowired
        JobSeekerRepository jobSeekerRepository;

//        @PostMapping("")

    }
