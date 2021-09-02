package com.drn.springsecurityazure.controller;

import com.drn.springsecurityazure.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/hello")
    @PreAuthorize("hasRole('ROLE_group2')")
    public String getMember(Model model) {
        model.addAttribute("hello", quoteService.getAllMembers());
        return "hello";
    }

    @GetMapping("/members/name")
    @PreAuthorize("hasRole('ROLE_group2')")
    public String getRandomMember(Model model){
        model.addAttribute("name", quoteService.getRandomMember());
        return "name";
    }

    @GetMapping("/members")
    @PreAuthorize("hasRole('ROLE_group2')")
    public String getMembers(Model model) {
        model.addAttribute("members" , quoteService.getRandomQuote());
        return "members";
    }

}
