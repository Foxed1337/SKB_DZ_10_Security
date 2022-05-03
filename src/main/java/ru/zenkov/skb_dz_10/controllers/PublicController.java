package ru.zenkov.skb_dz_10.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;


@Controller
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/api")
    public String testPublicApi() {
        return "public_user_page";
    }
}
