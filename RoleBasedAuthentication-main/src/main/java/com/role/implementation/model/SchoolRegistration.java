package com.role.implementation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school_registration")
public class SchoolRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;

    private boolean branding;
    private String proofBrandingImage;
    private String proofBrandingLink;

    private boolean inSchoolRecording;
    private String proofInSchoolRecordingImage;
    private String proofInSchoolRecordingLink;

    private boolean uploadOnYoutube;
    private String proofYoutubeUploadImage;
    private String proofYoutubeUploadLink;

    private boolean recordingInsideOutsideSchool;
    private String proofRecordingInsideOutsideImage;
    private String proofRecordingInsideOutsideLink;

    private boolean collaborateWithAgencies;
    private String proofCollaborateWithAgenciesImage;
    private String proofCollaborateWithAgenciesLink;

    private boolean logo;
    private String proofLogoImage;
    private String proofLogoLink;

    private boolean greenScreenTechnology;
    private String proofGreenScreenTechnologyImage;
    private String proofGreenScreenTechnologyLink;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public boolean isInSchoolRecording() {
        return inSchoolRecording;
    }

    public void setInSchoolRecording(boolean inSchoolRecording) {
        this.inSchoolRecording = inSchoolRecording;
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

    public boolean isUploadOnYoutube() {
        return uploadOnYoutube;
    }

    public void setUploadOnYoutube(boolean uploadOnYoutube) {
        this.uploadOnYoutube = uploadOnYoutube;
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

    public boolean isRecordingInsideOutsideSchool() {
        return recordingInsideOutsideSchool;
    }

    public void setRecordingInsideOutsideSchool(boolean recordingInsideOutsideSchool) {
        this.recordingInsideOutsideSchool = recordingInsideOutsideSchool;
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

    public boolean isCollaborateWithAgencies() {
        return collaborateWithAgencies;
    }

    public void setCollaborateWithAgencies(boolean collaborateWithAgencies) {
        this.collaborateWithAgencies = collaborateWithAgencies;
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

    public boolean isLogo() {
        return logo;
    }

    public void setLogo(boolean logo) {
        this.logo = logo;
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

    public boolean isGreenScreenTechnology() {
        return greenScreenTechnology;
    }

    public void setGreenScreenTechnology(boolean greenScreenTechnology) {
        this.greenScreenTechnology = greenScreenTechnology;
    }

    public String getProofGreenScreenTechnologyImage() {
        return proofGreenScreenTechnologyImage;
    }

    public void setProofGreenScreenTechnologyImage(String proofGreenScreenTechnologyImage) {
        this.proofGreenScreenTechnologyImage = proofGreenScreenTechnologyImage;
    }

    public String getProofGreenScreenTechnologyLink() {
        return proofGreenScreenTechnologyLink;
    }

    public void setProofGreenScreenTechnologyLink(String proofGreenScreenTechnologyLink) {
        this.proofGreenScreenTechnologyLink = proofGreenScreenTechnologyLink;
    }
}
