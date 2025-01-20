package com.role.implementation.controller;

import com.role.implementation.model.SchoolRegistration;
import com.role.implementation.repository.SchoolRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SchoolRegistrationController {

    @Autowired
    private SchoolRegistrationRepository registrationRepository;

    // Show registration form
    @GetMapping("/schoolRegistration")
    public String showRegistration(Model model) {
        model.addAttribute("schoolRegistration", new SchoolRegistration());
        model.addAttribute("success", false); // Initially set success to false
        return "schoolRegistration"; // Make sure this matches the name of your HTML template
    }

    // Handle form submission
    @PostMapping("/schoolRegistration")
    public String registerSchool(SchoolRegistration schoolRegistration, Model model) {
        // Save the registration to the database
        registrationRepository.save(schoolRegistration);
        
        // Add success message and reset the form
        model.addAttribute("success", true); // Set success to true after successful submission
        model.addAttribute("schoolRegistration", new SchoolRegistration()); // Reset form data

        return "schoolRegistration"; // Return the same page with cleared form and success message
    }
}
