package com.role.implementation.controller;

import com.role.implementation.DTO.ShootingEquipmentDTO;
import com.role.implementation.model.ShootingEquipment;
import com.role.implementation.model.User;
import com.role.implementation.repository.ShootingEquipmentRepository;
import com.role.implementation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shootingEquipment")
public class ShootingEquipmentController {

    @Autowired
    private ShootingEquipmentRepository shootingEquipmentRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String showShootingEquipmentForm(Model model) {
        // Get the currently logged-in user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userRepository.findByEmail(username);

        if (user == null) {
            return "redirect:/login"; // Redirect to login if user is not found
        }

        // Fetch the user's existing shooting equipment
        ShootingEquipment shootingEquipment = shootingEquipmentRepository.findByUser(user);

        // If the user has no shooting equipment, create a new DTO
        ShootingEquipmentDTO shootingEquipmentDTO = new ShootingEquipmentDTO();
        if (shootingEquipment != null) {
            shootingEquipmentDTO.setCameraQuantity(shootingEquipment.getCameraQuantity());
            shootingEquipmentDTO.setSmartphoneQuantity(shootingEquipment.getSmartphoneQuantity());
            shootingEquipmentDTO.setMicrophoneQuantity(shootingEquipment.getMicrophoneQuantity());
            shootingEquipmentDTO.setHeadphoneQuantity(shootingEquipment.getHeadphoneQuantity());
            shootingEquipmentDTO.setLaptopQuantity(shootingEquipment.getLaptopQuantity());
            shootingEquipmentDTO.setGreenscreenQuantity(shootingEquipment.getGreenscreenQuantity());
            shootingEquipmentDTO.setLightingQuantity(shootingEquipment.getLightingQuantity());
            shootingEquipmentDTO.setGrade(shootingEquipment.getGrade()); // Pass the grade to the DTO
        }

        model.addAttribute("shootingEquipmentDTO", shootingEquipmentDTO);
        return "shootingEquipment";
    }

    @PostMapping
    public String submitShootingEquipmentForm(ShootingEquipmentDTO shootingEquipmentDTO, Model model) {
        // Get the currently logged-in user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userRepository.findByEmail(username);

        if (user == null) {
            return "redirect:/login"; // Redirect to login if user is not found
        }

        // Check if the user already has shooting equipment
        ShootingEquipment shootingEquipment = shootingEquipmentRepository.findByUser(user);
        if (shootingEquipment == null) {
            shootingEquipment = new ShootingEquipment();
        }

        // Update shooting equipment details from the DTO
        shootingEquipment.setCameraQuantity(shootingEquipmentDTO.getCameraQuantity());
        shootingEquipment.setSmartphoneQuantity(shootingEquipmentDTO.getSmartphoneQuantity());
        shootingEquipment.setMicrophoneQuantity(shootingEquipmentDTO.getMicrophoneQuantity());
        shootingEquipment.setHeadphoneQuantity(shootingEquipmentDTO.getHeadphoneQuantity());
        shootingEquipment.setLaptopQuantity(shootingEquipmentDTO.getLaptopQuantity());
        shootingEquipment.setGreenscreenQuantity(shootingEquipmentDTO.getGreenscreenQuantity());
        shootingEquipment.setLightingQuantity(shootingEquipmentDTO.getLightingQuantity());

        // Calculate and set the grade
        String grade = calculateGrade(shootingEquipment);
        shootingEquipment.setGrade(grade);

        // Associate shooting equipment with the user
        shootingEquipment.setUser(user);

        // Save to database
        shootingEquipmentRepository.save(shootingEquipment);

        return "redirect:/shootingEquipment"; // Redirect back to the shooting equipment page
    }

    // Logic to calculate grade based on equipment quantities
    private String calculateGrade(ShootingEquipment shootingEquipment) {
        int cameraQuantity = shootingEquipment.getCameraQuantity();
        int smartphoneQuantity = shootingEquipment.getSmartphoneQuantity();
        int microphoneQuantity = shootingEquipment.getMicrophoneQuantity();
        int headphoneQuantity = shootingEquipment.getHeadphoneQuantity();
        int laptopQuantity = shootingEquipment.getLaptopQuantity();
        int greenscreenQuantity = shootingEquipment.getGreenscreenQuantity();
        int lightingQuantity = shootingEquipment.getLightingQuantity();

        if (cameraQuantity >= 2 && smartphoneQuantity >= 2 && microphoneQuantity >= 2 &&
            headphoneQuantity >= 2 && laptopQuantity >= 1 && greenscreenQuantity >= 1 && lightingQuantity >= 2) {
            return "A"; // Fully equipped
        } else if ((cameraQuantity >= 1 && smartphoneQuantity >= 1 && microphoneQuantity >= 1) ||
                   (laptopQuantity >= 1 && greenscreenQuantity >= 1 && lightingQuantity >= 1)) {
            return "B"; // Partially equipped
        } else if (cameraQuantity >= 1 || smartphoneQuantity >= 1 || microphoneQuantity >= 1 ||
                   laptopQuantity >= 1 || greenscreenQuantity >= 1 || lightingQuantity >= 1) {
            return "C"; // Basic equipment
        } else {
            return "D"; // Not equipped
        }
    }
}