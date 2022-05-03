package ru.zenkov.skb_dz_10.controllers;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@Controller
@RequestMapping("/admin")
@RolesAllowed("ADMIN")
public class AdminController {

    @GetMapping("/api")
    public String adminApi(Authentication authentication, Model model) {
        User user = (User) authentication.getPrincipal();
        model.addAttribute("user", user);
        return "admin_page";
    }
}
