package com.role.implementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.role.implementation.model.User;
import com.role.implementation.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/adminScreen")
public class AdminController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String displayDashboard(Model model) {
        String user = returnUsername();
        model.addAttribute("userDetails", user);
        return "adminScreen";
    }

    @GetMapping("/allUsers")
    public String showAllUsers(Model model, @RequestParam(required = false) String sortBy) {
    List<User> users;
    if (sortBy != null && sortBy.equals("name")) {
        users = userRepository.findAllByOrderByNameAsc();
    } else if (sortBy != null && sortBy.equals("address")) {
        users = userRepository.findAllByOrderByAddressAsc();
    } else {
        users = userRepository.findAll();
    }
    model.addAttribute("users", users);
    return "allUsers";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam int id) {
        userRepository.deleteById(id); // Delete the user by ID
        return "redirect:/adminScreen/allUsers"; // Redirect back to the all users page
    }

    private String returnUsername() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        UserDetails user = (UserDetails) securityContext.getAuthentication().getPrincipal();
        User users = userRepository.findByEmail(user.getUsername());
        return users != null ? users.getName() : "Unknown User";
    }
}