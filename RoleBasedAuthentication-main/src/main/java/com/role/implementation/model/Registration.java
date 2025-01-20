package com.role.implementation.model;

public class Registration {

    private String schoolName;
    private boolean branding;
    private boolean inSchoolRecording;
    private boolean uploadOnYoutube;
    private boolean recordingInsideOutsideSchool;
    private boolean collaborateWithAgencies;
    private boolean logo;
    private boolean greenScreenTechnology;

    // Getters and Setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public boolean isBranding() {
        return branding;
    }

    public void setBranding(boolean branding) {
        this.branding = branding;
    }

    public boolean isInSchoolRecording() {
        return inSchoolRecording;
    }

    public void setInSchoolRecording(boolean inSchoolRecording) {
        this.inSchoolRecording = inSchoolRecording;
    }

    public boolean isUploadOnYoutube() {
        return uploadOnYoutube;
    }

    public void setUploadOnYoutube(boolean uploadOnYoutube) {
        this.uploadOnYoutube = uploadOnYoutube;
    }

    public boolean isRecordingInsideOutsideSchool() {
        return recordingInsideOutsideSchool;
    }

    public void setRecordingInsideOutsideSchool(boolean recordingInsideOutsideSchool) {
        this.recordingInsideOutsideSchool = recordingInsideOutsideSchool;
    }

    public boolean isCollaborateWithAgencies() {
        return collaborateWithAgencies;
    }

    public void setCollaborateWithAgencies(boolean collaborateWithAgencies) {
        this.collaborateWithAgencies = collaborateWithAgencies;
    }

    public boolean isLogo() {
        return logo;
    }

    public void setLogo(boolean logo) {
        this.logo = logo;
    }

    public boolean isGreenScreenTechnology() {
        return greenScreenTechnology;
    }

    public void setGreenScreenTechnology(boolean greenScreenTechnology) {
        this.greenScreenTechnology = greenScreenTechnology;
    }
}
