package com.role.implementation.repository;

import com.role.implementation.model.SchoolRegistration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SchoolRegistrationRepository extends JpaRepository<SchoolRegistration, Long> {

    // Find a Registration by school name
    Optional<SchoolRegistration> findBySchoolName(String schoolName);

    // Find all Registrations by branding status
    List<SchoolRegistration> findByBranding(boolean branding);

    // Find all Registrations by in-school recording status
    List<SchoolRegistration> findByInSchoolRecording(boolean inSchoolRecording);

    // Find all Registrations by uploading on YouTube status
    List<SchoolRegistration> findByUploadOnYoutube(boolean uploadOnYoutube);

    // Find all Registrations by recording inside or outside school status
    List<SchoolRegistration> findByRecordingInsideOutsideSchool(boolean recordingInsideOutsideSchool);

    // Find all Registrations by collaborating with agencies status
    List<SchoolRegistration> findByCollaborateWithAgencies(boolean collaborateWithAgencies);

    // Find all Registrations by logo status
    List<SchoolRegistration> findByLogo(boolean logo);

    // Find all Registrations by green screen technology status
    List<SchoolRegistration> findByGreenScreenTechnology(boolean greenScreenTechnology);

    // Find Registrations with optional filters (pagination and sorting)
    Page<SchoolRegistration> findBySchoolNameContainingIgnoreCaseAndBrandingAndInSchoolRecording(
            String schoolName, boolean branding, boolean inSchoolRecording, Pageable pageable);

    // Find Registrations with pagination and sorting by branding status
    Page<SchoolRegistration> findByBranding(boolean branding, Pageable pageable);

    // Find Registrations by uploading on YouTube with pagination and sorting
    Page<SchoolRegistration> findByUploadOnYoutube(boolean uploadOnYoutube, Pageable pageable);

    // Find Registrations by recording inside or outside school with pagination and sorting
    Page<SchoolRegistration> findByRecordingInsideOutsideSchool(boolean recordingInsideOutsideSchool, Pageable pageable);

    // Find Registrations by collaborating with agencies with pagination and sorting
    Page<SchoolRegistration> findByCollaborateWithAgencies(boolean collaborateWithAgencies, Pageable pageable);

    // Find Registrations by logo with pagination and sorting
    Page<SchoolRegistration> findByLogo(boolean logo, Pageable pageable);

    // Find Registrations by green screen technology with pagination and sorting
    Page<SchoolRegistration> findByGreenScreenTechnology(boolean greenScreenTechnology, Pageable pageable);
}
