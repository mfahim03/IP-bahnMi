package com.role.implementation.controller;

import com.role.implementation.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SchoolRegistrationController {

    // Display the School Registration Form
    @GetMapping("/schoolRegistration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "registration"; // The Thymeleaf template for registration form
    }

    // Handle the form submission for School Registration
    @PostMapping("/register")
    public String registerSchool(Registration registration, Model model) {
        // Save registration to the database or perform necessary operations here
        // For now, we simulate a successful registration

        // Adding a success message to the model to be displayed in the view
        model.addAttribute("success", true);

        // Reset the form by passing a new instance of Registration
        model.addAttribute("registration", new Registration());

        // Redirecting to the same page with a success message
        return "redirect:/schoolRegistration?success=true";
    }
}
