package com.ethos.legal.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public String landingPage(){
//        m.addAttribute("principal", principal);
        return "Landing.html";
    }
}
