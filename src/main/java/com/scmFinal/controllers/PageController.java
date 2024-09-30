package com.scmFinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    // is route p click krke ye controller call hoga
    // Home Route
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Handler");
        // sending data to view
        model.addAttribute("name", "Tanya Agarwal"); // now we add name , value of attribute 
        model.addAttribute("youtubeChannel", "hey yaa tanya"); // now we add name , value of attribute 
        model.addAttribute("googleLink", "https://www.google.com"); // now we add name , value of attribute 
        return "home";
    }

    // About Route
    @RequestMapping("/about")
    public String about(Model model){
        System.out.println("About page loading");
        return "about";
    }

    // Services Route
    @RequestMapping("/services")
    public String servicesPage(Model model){
        System.out.println("Services page loading");
        model.addAttribute("isLogin", true);
        return "services";
    }

}
