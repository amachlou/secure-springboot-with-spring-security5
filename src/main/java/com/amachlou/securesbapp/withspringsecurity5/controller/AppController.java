package com.amachlou.securesbapp.withspringsecurity5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    @GetMapping
    public String home(Principal principal){
        return "Welcome Home ... "+principal;
    }

}
