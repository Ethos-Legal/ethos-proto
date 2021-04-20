package com.ethos.legal.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public RedirectView startUp() {
        return new RedirectView("/login");
    }

    @GetMapping("/login")
    public String landingPage(){
//        m.addAttribute("principal", principal);
        return "Landing.html";
    }

}
