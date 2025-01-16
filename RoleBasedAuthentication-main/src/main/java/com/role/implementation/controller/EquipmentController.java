package com.role.implementation.controller;

import com.role.implementation.DTO.EquipmentDTO;
import com.role.implementation.model.Equipment;
import com.role.implementation.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentRepository equipmentRepository;

    // Show the form for adding/updating equipment
    @GetMapping
    public String showEquipmentForm(Model model) {
        model.addAttribute("equipmentDTO", new EquipmentDTO());
        return "equipment";
    }

    // Handle form submission
    @PostMapping
    public String submitEquipmentForm(@ModelAttribute EquipmentDTO equipmentDTO, Model model) {
        // Convert DTO to Entity
        Equipment equipment = new Equipment();
        equipment.setCameraQuantity(equipmentDTO.getCameraQuantity());
        equipment.setMicrophoneQuantity(equipmentDTO.getMicrophoneQuantity());
        equipment.setGreenScreenQuantity(equipmentDTO.getGreenScreenQuantity());
        equipment.setTripodQuantity(equipmentDTO.getTripodQuantity());
        equipment.setLightingQuantity(equipmentDTO.getLightingQuantity());

        // Calculate grade
        String grade = calculateGrade(equipment);
        equipment.setGrade(grade);

        // Save to database
        equipmentRepository.save(equipment);

        // Add the saved entity to the model for display
        model.addAttribute("equipment", equipment);
        return "result"; // Ensure this matches the name of your result template
    }

    // Logic to calculate grade based on quantity
    private String calculateGrade(Equipment equipment) {
        int cameraQuantity = equipment.getCameraQuantity();
        int microphoneQuantity = equipment.getMicrophoneQuantity();
        int tripodQuantity = equipment.getTripodQuantity();

        if (cameraQuantity >= 1 && microphoneQuantity >= 1 && tripodQuantity >= 1) {
            return "A"; // Fully equipped
        } else if ((cameraQuantity >= 1 && microphoneQuantity >= 1) ||
                   (cameraQuantity >= 1 && tripodQuantity >= 1) ||
                   (microphoneQuantity >= 1 && tripodQuantity >= 1)) {
            return "B"; // Partially equipped
        } else {
            return "C"; // Not sufficiently equipped
        }
    }
}