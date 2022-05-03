package ru.zenkov.skb_dz_10.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;


@Controller
@RequestMapping("/support")
@RolesAllowed("SUPPORT")
public class SupportController {

    @GetMapping("/api")
    public String supportApi(Authentication authentication, Model model) {
        User user = (User) authentication.getPrincipal();
        model.addAttribute("user", user);
        return "support_page";
    }
}
