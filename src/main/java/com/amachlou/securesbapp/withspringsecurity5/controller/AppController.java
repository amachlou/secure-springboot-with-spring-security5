package com.amachlou.securesbapp.withspringsecurity5.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    public static final Logger log = LoggerFactory.getLogger(AppController.class);

    @GetMapping("/user")
    public String home(Principal principal){
        return "Welcome Home ... "+principal.getName();
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin(){
        return "... Admin!";
    }

}
