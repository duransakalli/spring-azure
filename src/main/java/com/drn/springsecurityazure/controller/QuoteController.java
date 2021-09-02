package com.drn.springsecurityazure.controller;

import com.drn.springsecurityazure.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/hello")
    public String getMember(Model model) {
        model.addAttribute("welcome", "Welcome to the page");
        return "hello";
    }

    @GetMapping("/members/name")
    public String getRandomMember(Model model){
        model.addAttribute("name", quoteService.getRandomMember());
        return "name";
    }

    @GetMapping("/members")
    public String getMembers(Model model) {
        model.addAttribute("members" , quoteService.getAllMembers());
        return "members";
    }

}
