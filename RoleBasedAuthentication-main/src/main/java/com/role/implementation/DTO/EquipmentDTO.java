package com.role.implementation.DTO;

public class EquipmentDTO {

    private int cameraQuantity;
    private int microphoneQuantity;
    private int greenScreenQuantity;
    private int tripodQuantity;
    private int lightingQuantity;
    private String grade;

    // Getters and Setters
    public int getCameraQuantity() {
        return cameraQuantity;
    }

    public void setCameraQuantity(int cameraQuantity) {
        this.cameraQuantity = cameraQuantity;
    }

    public int getMicrophoneQuantity() {
        return microphoneQuantity;
    }

    public void setMicrophoneQuantity(int microphoneQuantity) {
        this.microphoneQuantity = microphoneQuantity;
    }

    public int getGreenScreenQuantity() {
        return greenScreenQuantity;
    }

    public void setGreenScreenQuantity(int greenScreenQuantity) {
        this.greenScreenQuantity = greenScreenQuantity;
    }

    public int getTripodQuantity() {
        return tripodQuantity;
    }

    public void setTripodQuantity(int tripodQuantity) {
        this.tripodQuantity = tripodQuantity;
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
}