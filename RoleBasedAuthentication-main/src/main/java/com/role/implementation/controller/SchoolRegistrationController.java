package com.role.implementation.controller;

import com.role.implementation.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

@Controller
public class SchoolRegistrationController {

    // Show the registration form with an empty Registration object
    @GetMapping("/schoolRegistration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registration"; // Thymeleaf template name
    }

    // Handle form submission and registration processing
    @PostMapping("/register")
    public String registerSchool(@Validated Registration registration, BindingResult bindingResult, Model model) {
        // If there are validation errors, return to the registration form
        if (bindingResult.hasErrors()) {
            return "registration"; // Return to the registration page with errors
        }

        // Simulate saving the data or any required processing
        // For example: save to the database or perform some business logic
        System.out.println("Registration submitted: " + registration);

        // Add success message and reset the form
        model.addAttribute("success", true);
        model.addAttribute("registration", new Registration()); // Reset form data

        return "registration"; // Return the same page with cleared form
    }
}
