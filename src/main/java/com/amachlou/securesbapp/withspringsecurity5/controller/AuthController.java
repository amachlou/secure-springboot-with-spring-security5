package com.amachlou.securesbapp.withspringsecurity5.controller;

import com.amachlou.securesbapp.withspringsecurity5.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final static Logger log = LoggerFactory.getLogger(AuthController.class);
    private TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String home(Authentication authentication){
        log.info("Authenticated ... "+authentication.getName());
        return tokenService.generateToken(authentication);
    }

}
