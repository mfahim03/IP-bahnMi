package com.role.implementation.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Optional;

public class SchoolRegistrationDTO {

    @NotNull
    @Size(min = 1, message = "School name cannot be empty")
    private String schoolName;

    private boolean branding;
    private Optional<String> proofBrandingImage = Optional.empty();
    private Optional<String> proofBrandingLink = Optional.empty();

    private boolean inSchoolRecording;
    private Optional<String> proofInSchoolRecordingImage = Optional.empty();
    private Optional<String> proofInSchoolRecordingLink = Optional.empty();

    private boolean uploadOnYoutube;
    private Optional<String> proofYoutubeUploadImage = Optional.empty();
    private Optional<String> proofYoutubeUploadLink = Optional.empty();

    private boolean recordingInsideOutsideSchool;
    private Optional<String> proofRecordingInsideOutsideImage = Optional.empty();
    private Optional<String> proofRecordingInsideOutsideLink = Optional.empty();

    private boolean collaborateWithAgencies;
    private Optional<String> proofCollaborateWithAgenciesImage = Optional.empty();
    private Optional<String> proofCollaborateWithAgenciesLink = Optional.empty();

    private boolean logo;
    private Optional<String> proofLogoImage = Optional.empty();
    private Optional<String> proofLogoLink = Optional.empty();

    private boolean greenScreenTechnology;
    private Optional<String> proofGreenScreenTechnologyImage = Optional.empty();
    private Optional<String> proofGreenScreenTechnologyLink = Optional.empty();

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

    public Optional<String> getProofBrandingImage() {
        return proofBrandingImage;
    }

    public void setProofBrandingImage(Optional<String> proofBrandingImage) {
        this.proofBrandingImage = proofBrandingImage;
    }

    public Optional<String> getProofBrandingLink() {
        return proofBrandingLink;
    }

    public void setProofBrandingLink(Optional<String> proofBrandingLink) {
        this.proofBrandingLink = proofBrandingLink;
    }

    public boolean isInSchoolRecording() {
        return inSchoolRecording;
    }

    public void setInSchoolRecording(boolean inSchoolRecording) {
        this.inSchoolRecording = inSchoolRecording;
    }

    public Optional<String> getProofInSchoolRecordingImage() {
        return proofInSchoolRecordingImage;
    }

    public void setProofInSchoolRecordingImage(Optional<String> proofInSchoolRecordingImage) {
        this.proofInSchoolRecordingImage = proofInSchoolRecordingImage;
    }

    public Optional<String> getProofInSchoolRecordingLink() {
        return proofInSchoolRecordingLink;
    }

    public void setProofInSchoolRecordingLink(Optional<String> proofInSchoolRecordingLink) {
        this.proofInSchoolRecordingLink = proofInSchoolRecordingLink;
    }

    public boolean isUploadOnYoutube() {
        return uploadOnYoutube;
    }

    public void setUploadOnYoutube(boolean uploadOnYoutube) {
        this.uploadOnYoutube = uploadOnYoutube;
    }

    public Optional<String> getProofYoutubeUploadImage() {
        return proofYoutubeUploadImage;
    }

    public void setProofYoutubeUploadImage(Optional<String> proofYoutubeUploadImage) {
        this.proofYoutubeUploadImage = proofYoutubeUploadImage;
    }

    public Optional<String> getProofYoutubeUploadLink() {
        return proofYoutubeUploadLink;
    }

    public void setProofYoutubeUploadLink(Optional<String> proofYoutubeUploadLink) {
        this.proofYoutubeUploadLink = proofYoutubeUploadLink;
    }

    public boolean isRecordingInsideOutsideSchool() {
        return recordingInsideOutsideSchool;
    }

    public void setRecordingInsideOutsideSchool(boolean recordingInsideOutsideSchool) {
        this.recordingInsideOutsideSchool = recordingInsideOutsideSchool;
    }

    public Optional<String> getProofRecordingInsideOutsideImage() {
        return proofRecordingInsideOutsideImage;
    }

    public void setProofRecordingInsideOutsideImage(Optional<String> proofRecordingInsideOutsideImage) {
        this.proofRecordingInsideOutsideImage = proofRecordingInsideOutsideImage;
    }

    public Optional<String> getProofRecordingInsideOutsideLink() {
        return proofRecordingInsideOutsideLink;
    }

    public void setProofRecordingInsideOutsideLink(Optional<String> proofRecordingInsideOutsideLink) {
        this.proofRecordingInsideOutsideLink = proofRecordingInsideOutsideLink;
    }

    public boolean isCollaborateWithAgencies() {
        return collaborateWithAgencies;
    }

    public void setCollaborateWithAgencies(boolean collaborateWithAgencies) {
        this.collaborateWithAgencies = collaborateWithAgencies;
    }

    public Optional<String> getProofCollaborateWithAgenciesImage() {
        return proofCollaborateWithAgenciesImage;
    }

    public void setProofCollaborateWithAgenciesImage(Optional<String> proofCollaborateWithAgenciesImage) {
        this.proofCollaborateWithAgenciesImage = proofCollaborateWithAgenciesImage;
    }

    public Optional<String> getProofCollaborateWithAgenciesLink() {
        return proofCollaborateWithAgenciesLink;
    }

    public void setProofCollaborateWithAgenciesLink(Optional<String> proofCollaborateWithAgenciesLink) {
        this.proofCollaborateWithAgenciesLink = proofCollaborateWithAgenciesLink;
    }

    public boolean isLogo() {
        return logo;
    }

    public void setLogo(boolean logo) {
        this.logo = logo;
    }

    public Optional<String> getProofLogoImage() {
        return proofLogoImage;
    }

    public void setProofLogoImage(Optional<String> proofLogoImage) {
        this.proofLogoImage = proofLogoImage;
    }

    public Optional<String> getProofLogoLink() {
        return proofLogoLink;
    }

    public void setProofLogoLink(Optional<String> proofLogoLink) {
        this.proofLogoLink = proofLogoLink;
    }

    public boolean isGreenScreenTechnology() {
        return greenScreenTechnology;
    }

    public void setGreenScreenTechnology(boolean greenScreenTechnology) {
        this.greenScreenTechnology = greenScreenTechnology;
    }

    public Optional<String> getProofGreenScreenTechnologyImage() {
        return proofGreenScreenTechnologyImage;
    }

    public void setProofGreenScreenTechnologyImage(Optional<String> proofGreenScreenTechnologyImage) {
        this.proofGreenScreenTechnologyImage = proofGreenScreenTechnologyImage;
    }

    public Optional<String> getProofGreenScreenTechnologyLink() {
        return proofGreenScreenTechnologyLink;
    }

    public void setProofGreenScreenTechnologyLink(Optional<String> proofGreenScreenTechnologyLink) {
        this.proofGreenScreenTechnologyLink = proofGreenScreenTechnologyLink;
    }
}
