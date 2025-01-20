package com.role.implementation.repository;

import com.role.implementation.DTO.SchoolRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository
public class SchoolRegistrationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Method to save the SchoolRegistrationDTO data
    public int saveSchoolRegistration(SchoolRegistrationDTO registrationDTO) {
        String sql = "INSERT INTO school_registration (school_name, branding, proof_branding_image, proof_branding_link, " +
                     "in_school_recording, proof_in_school_recording_image, proof_in_school_recording_link, " +
                     "upload_on_youtube, proof_youtube_upload_image, proof_youtube_upload_link, " +
                     "recording_inside_outside_school, proof_recording_inside_outside_image, proof_recording_inside_outside_link, " +
                     "collaborate_with_agencies, proof_collaborate_with_agencies_image, proof_collaborate_with_agencies_link, " +
                     "logo, proof_logo_image, proof_logo_link, green_screen_technology, proof_green_screen_technology_image, proof_green_screen_technology_link) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        return jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(java.sql.PreparedStatement ps) throws java.sql.SQLException {
                ps.setString(1, registrationDTO.getSchoolName());
                ps.setBoolean(2, registrationDTO.isBranding());
                ps.setString(3, registrationDTO.getProofBrandingImage());
                ps.setString(4, registrationDTO.getProofBrandingLink());
                ps.setBoolean(5, registrationDTO.isInSchoolRecording());
                ps.setString(6, registrationDTO.getProofInSchoolRecordingImage());
                ps.setString(7, registrationDTO.getProofInSchoolRecordingLink());
                ps.setBoolean(8, registrationDTO.isUploadOnYoutube());
                ps.setString(9, registrationDTO.getProofYoutubeUploadImage());
                ps.setString(10, registrationDTO.getProofYoutubeUploadLink());
                ps.setBoolean(11, registrationDTO.isRecordingInsideOutsideSchool());
                ps.setString(12, registrationDTO.getProofRecordingInsideOutsideImage());
                ps.setString(13, registrationDTO.getProofRecordingInsideOutsideLink());
                ps.setBoolean(14, registrationDTO.isCollaborateWithAgencies());
                ps.setString(15, registrationDTO.getProofCollaborateWithAgenciesImage());
                ps.setString(16, registrationDTO.getProofCollaborateWithAgenciesLink());
                ps.setBoolean(17, registrationDTO.isLogo());
                ps.setString(18, registrationDTO.getProofLogoImage());
                ps.setString(19, registrationDTO.getProofLogoLink());
                ps.setBoolean(20, registrationDTO.isGreenScreenTechnology());
                ps.setString(21, registrationDTO.getProofGreenScreenTechnologyImage());
                ps.setString(22, registrationDTO.getProofGreenScreenTechnologyLink());
            }
        });
    }

    // Additional methods for fetching, updating, or deleting records can be added similarly
}
