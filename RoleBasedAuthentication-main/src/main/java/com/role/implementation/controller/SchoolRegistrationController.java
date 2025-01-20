package com.role.implementation.controller;

import com.role.implementation.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SchoolRegistrationController {

    @GetMapping("/schoolRegistration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registration"; // Thymeleaf template name
    }

    @PostMapping("/register")
    public String registerSchool(Registration registration, Model model) {
        // Simulate saving the data or any required processing
        // For example: save to the database or perform some business logic
        System.out.println("Registration submitted: " + registration);

        // Add success message and reset the form
        model.addAttribute("success", true);
        model.addAttribute("registration", new Registration()); // Reset form data

        return "registration"; // Return the same page with cleared form
    }
}
