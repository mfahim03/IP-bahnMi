package com.role.implementation.model;

import javax.validation.constraints.NotNull;

public class Registration {

    @NotNull
    private String schoolName;

    private boolean branding;
    private boolean inSchoolRecording;
    private boolean uploadOnYoutube;
    private boolean recordingInsideOutsideSchool;
    private boolean collaborateWithAgencies;
    private boolean logo;
    private boolean greenScreenTechnology;

    // Fields for file uploads and URLs
    private String proofBrandingImage;
    private String proofBrandingLink;
    
    private String proofInSchoolRecordingImage;
    private String proofInSchoolRecordingLink;
    
    private String proofYoutubeUploadImage;
    private String proofYoutubeUploadLink;
    
    private String proofRecordingInsideOutsideImage;
    private String proofRecordingInsideOutsideLink;
    
    private String proofCollaborateWithAgenciesImage;
    private String proofCollaborateWithAgenciesLink;
    
    private String proofLogoImage;
    private String proofLogoLink;
    
    private String proofGreenScreenImage;
    private String proofGreenScreenLink;

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

    // File and URL Getters and Setters

    public String getProofBrandingImage() {
        return proofBrandingImage;
    }

    public void setProofBrandingImage(String proofBrandingImage) {
        this.proofBrandingImage = proofBrandingImage;
    }

    public String getProofBrandingLink() {
        return proofBrandingLink;
    }

    public void setProofBrandingLink(String proofBrandingLink) {
        this.proofBrandingLink = proofBrandingLink;
    }

    public String getProofInSchoolRecordingImage() {
        return proofInSchoolRecordingImage;
    }

    public void setProofInSchoolRecordingImage(String proofInSchoolRecordingImage) {
        this.proofInSchoolRecordingImage = proofInSchoolRecordingImage;
    }

    public String getProofInSchoolRecordingLink() {
        return proofInSchoolRecordingLink;
    }

    public void setProofInSchoolRecordingLink(String proofInSchoolRecordingLink) {
        this.proofInSchoolRecordingLink = proofInSchoolRecordingLink;
    }

    public String getProofYoutubeUploadImage() {
        return proofYoutubeUploadImage;
    }

    public void setProofYoutubeUploadImage(String proofYoutubeUploadImage) {
        this.proofYoutubeUploadImage = proofYoutubeUploadImage;
    }

    public String getProofYoutubeUploadLink() {
        return proofYoutubeUploadLink;
    }

    public void setProofYoutubeUploadLink(String proofYoutubeUploadLink) {
        this.proofYoutubeUploadLink = proofYoutubeUploadLink;
    }

    public String getProofRecordingInsideOutsideImage() {
        return proofRecordingInsideOutsideImage;
    }

    public void setProofRecordingInsideOutsideImage(String proofRecordingInsideOutsideImage) {
        this.proofRecordingInsideOutsideImage = proofRecordingInsideOutsideImage;
    }

    public String getProofRecordingInsideOutsideLink() {
        return proofRecordingInsideOutsideLink;
    }

    public void setProofRecordingInsideOutsideLink(String proofRecordingInsideOutsideLink) {
        this.proofRecordingInsideOutsideLink = proofRecordingInsideOutsideLink;
    }

    public String getProofCollaborateWithAgenciesImage() {
        return proofCollaborateWithAgenciesImage;
    }

    public void setProofCollaborateWithAgenciesImage(String proofCollaborateWithAgenciesImage) {
        this.proofCollaborateWithAgenciesImage = proofCollaborateWithAgenciesImage;
    }

    public String getProofCollaborateWithAgenciesLink() {
        return proofCollaborateWithAgenciesLink;
    }

    public void setProofCollaborateWithAgenciesLink(String proofCollaborateWithAgenciesLink) {
        this.proofCollaborateWithAgenciesLink = proofCollaborateWithAgenciesLink;
    }

    public String getProofLogoImage() {
        return proofLogoImage;
    }

    public void setProofLogoImage(String proofLogoImage) {
        this.proofLogoImage = proofLogoImage;
    }

    public String getProofLogoLink() {
        return proofLogoLink;
    }

    public void setProofLogoLink(String proofLogoLink) {
        this.proofLogoLink = proofLogoLink;
    }

    public String getProofGreenScreenImage() {
        return proofGreenScreenImage;
    }

    public void setProofGreenScreenImage(String proofGreenScreenImage) {
        this.proofGreenScreenImage = proofGreenScreenImage;
    }

    public String getProofGreenScreenLink() {
        return proofGreenScreenLink;
    }

    public void setProofGreenScreenLink(String proofGreenScreenLink) {
        this.proofGreenScreenLink = proofGreenScreenLink;
    }
}
