package com.scmFinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scmFinal.forms.UserForm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


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

    // Contact Route
    @GetMapping("/contact")
    public String contactPage() {
        return new String("contact");
    }
    
    // Login Route
    @GetMapping("/login")
    public String loginPage() {
        return new String("login");
    }
    
    // Signup Route
    @GetMapping("/register")
    public String register(Model model) {
        
        // ek blank object bhejdo in register page
        UserForm userForm = new UserForm();
        // eg. agr yha hm value set krke bhjege then it will display as it is on form 
        // userForm.setName("Tanya");

        // we can also add default data in this
        model.addAttribute("userForm", userForm);

        return "register";
    }
    
    // processing register
    // signup k time when the user clicks on signup button, /do-register url is appended which handles form data submission
    // it is a POST method
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    // userForm object create hoga or uske andar saari values aa jayegi 
    public String processRegister(@ModelAttribute UserForm userForm) {

        // step1- fetch form data
        // userForm k class k andar as an object sara form data recieve krege
        System.out.println(userForm);

        // step2- validate form data

        // step3- save to database
        // for this purpose, we use userservice

        // step4- message = "Registration successfull"

        // step5- redirect to login page

        // step6- jb ye method chalega, after that redirect to /register page
        // used when after clicking on submit, you want form to re empty
        return "redirect:/register";

    }
}
