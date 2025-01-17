// package com.role.implementation.controller;

// import com.role.implementation.DTO.EquipmentDTO;
// import com.role.implementation.model.Equipment;
// import com.role.implementation.model.User;
// import com.role.implementation.repository.EquipmentRepository;
// import com.role.implementation.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;

// @Controller
// @RequestMapping("/equipment")
// public class EquipmentController {

//     @Autowired
//     private EquipmentRepository equipmentRepository;

//     @Autowired
//     private UserRepository userRepository;

//     // Show the form for adding/updating equipment
//     @GetMapping
//     public String showEquipmentForm(Model model) {
//         // Get the currently logged-in user
//         Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//         String username = authentication.getName();
//         User user = userRepository.findByEmail(username);

//         // Fetch the user's existing equipment
//         Equipment equipment = equipmentRepository.findByUser(user);

//         // If the user has no equipment, create a new DTO
//         EquipmentDTO equipmentDTO = new EquipmentDTO();
//         if (equipment != null) {
//             equipmentDTO.setCameraQuantity(equipment.getCameraQuantity());
//             equipmentDTO.setMicrophoneQuantity(equipment.getMicrophoneQuantity());
//             equipmentDTO.setGreenScreenQuantity(equipment.getGreenScreenQuantity());
//             equipmentDTO.setTripodQuantity(equipment.getTripodQuantity());
//             equipmentDTO.setLightingQuantity(equipment.getLightingQuantity());
//             equipmentDTO.setGrade(equipment.getGrade());
//             equipmentDTO.setUserId(equipment.getUser().getId());
//         }

//         model.addAttribute("equipmentDTO", equipmentDTO);
//         model.addAttribute("equipment", equipment); // Pass the equipment object to the template
//         return "equipment";
//     }

//     // Handle form submission (insert or update)
//     @PostMapping
//     public String submitEquipmentForm(@ModelAttribute EquipmentDTO equipmentDTO, Model model) {
//         // Get the currently logged-in user
//         Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//         String username = authentication.getName();
//         User user = userRepository.findByEmail(username);

//         // Check if the user already has equipment
//         Equipment equipment = equipmentRepository.findByUser(user);
//         if (equipment == null) {
//             equipment = new Equipment();
//         }

//         // Update equipment details
//         equipment.setCameraQuantity(equipmentDTO.getCameraQuantity());
//         equipment.setMicrophoneQuantity(equipmentDTO.getMicrophoneQuantity());
//         equipment.setGreenScreenQuantity(equipmentDTO.getGreenScreenQuantity());
//         equipment.setTripodQuantity(equipmentDTO.getTripodQuantity());
//         equipment.setLightingQuantity(equipmentDTO.getLightingQuantity());

//         // Calculate grade
//         String grade = calculateGrade(equipment);
//         equipment.setGrade(grade);

//         // Associate equipment with the user
//         equipment.setUser(user);

//         // Save to database
//         equipmentRepository.save(equipment);

//         // Add the saved entity to the model for display
//         model.addAttribute("equipment", equipment);
//         return "redirect:/equipment"; // Redirect back to the equipment page
//     }

//     // Handle equipment deletion
//     @PostMapping("/delete")
//     public String deleteEquipment() {
//         // Get the currently logged-in user
//         Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//         String username = authentication.getName();
//         User user = userRepository.findByEmail(username);

//         // Fetch the user's equipment and delete it
//         Equipment equipment = equipmentRepository.findByUser(user);
//         if (equipment != null) {
//             equipmentRepository.delete(equipment);
//         }

//         return "redirect:/equipment"; // Redirect back to the equipment page
//     }

//     // Logic to calculate grade based on quantity
//     private String calculateGrade(Equipment equipment) {
//         int cameraQuantity = equipment.getCameraQuantity();
//         int microphoneQuantity = equipment.getMicrophoneQuantity();
//         int tripodQuantity = equipment.getTripodQuantity();

//         if (cameraQuantity >= 1 && microphoneQuantity >= 1 && tripodQuantity >= 1) {
//             return "A"; // Fully equipped
//         } else if ((cameraQuantity >= 1 && microphoneQuantity >= 1) ||
//                    (cameraQuantity >= 1 && tripodQuantity >= 1) ||
//                    (microphoneQuantity >= 1 && tripodQuantity >= 1)) {
//             return "B"; // Partially equipped
//         } else {
//             return "C"; // Not sufficiently equipped
//         }
//     }
// }