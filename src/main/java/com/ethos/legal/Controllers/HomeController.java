package com.ethos.legal.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class HomeController {

    @GetMapping("/home")
    public String homePage(Principal principal, Model m){
        m.addAttribute("principal", principal);
        return "home.html";
    }



}
