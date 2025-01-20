package com.role.implementation.service;

import com.role.implementation.DTO.SchoolRegistrationDTO;
import com.role.implementation.repository.SchoolRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolRegistrationService {

    @Autowired
    private SchoolRegistrationRepository repository;

    // Save SchoolRegistrationDTO to the database
    public int save(SchoolRegistrationDTO dto) {
        return repository.saveSchoolRegistration(dto);
    }
}
