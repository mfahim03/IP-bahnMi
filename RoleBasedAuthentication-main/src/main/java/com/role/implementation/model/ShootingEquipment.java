package com.role.implementation.model;

import javax.persistence.*;

@Entity
public class ShootingEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cameraQuantity;
    private int smartphoneQuantity;
    private int microphoneQuantity;
    private int headphoneQuantity;
    private int laptopQuantity;
    private int greenscreenQuantity;
    private int lightingQuantity;
    private String grade;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCameraQuantity() {
        return cameraQuantity;
    }

    public void setCameraQuantity(int cameraQuantity) {
        this.cameraQuantity = cameraQuantity;
    }

    public int getSmartphoneQuantity() {
        return smartphoneQuantity;
    }

    public void setSmartphoneQuantity(int smartphoneQuantity) {
        this.smartphoneQuantity = smartphoneQuantity;
    }

    public int getMicrophoneQuantity() {
        return microphoneQuantity;
    }

    public void setMicrophoneQuantity(int microphoneQuantity) {
        this.microphoneQuantity = microphoneQuantity;
    }

    public int getHeadphoneQuantity() {
        return headphoneQuantity;
    }

    public void setHeadphoneQuantity(int headphoneQuantity) {
        this.headphoneQuantity = headphoneQuantity;
    }

    public int getLaptopQuantity() {
        return laptopQuantity;
    }

    public void setLaptopQuantity(int laptopQuantity) {
        this.laptopQuantity = laptopQuantity;
    }

    public int getGreenscreenQuantity() {
        return greenscreenQuantity;
    }

    public void setGreenscreenQuantity(int greenscreenQuantity) {
        this.greenscreenQuantity = greenscreenQuantity;
    }

    public int getLightingQuantity() {
        return lightingQuantity;
    }

    public void setLightingQuantity(int lightingQuantity) {
        this.lightingQuantity = lightingQuantity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}