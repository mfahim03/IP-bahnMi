package com.role.implementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.role.implementation.DTO.UserProfileDTO;
import com.role.implementation.model.User;
import com.role.implementation.repository.UserRepository;
import com.role.implementation.service.DefaultUserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private DefaultUserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String showProfile(Model model) {
        String email = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
        User user = userRepository.findByEmail(email);
        UserProfileDTO userProfileDTO = new UserProfileDTO();
        userProfileDTO.setName(user.getName());
        userProfileDTO.setEmail(user.getEmail());
        userProfileDTO.setBio(user.getBio());
        userProfileDTO.setPhoneNumber(user.getPhoneNumber());
        userProfileDTO.setAddress(user.getAddress());
        model.addAttribute("userProfile", userProfileDTO);
        return "profile";
    }

    @PostMapping
    public String updateProfile(@Valid @ModelAttribute("userProfile") UserProfileDTO userProfileDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "profile";
        }
        userService.updateUserProfile(userProfileDTO);
        return "redirect:/profile";
    }
}