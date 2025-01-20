package com.role.implementation.service;

import com.role.implementation.model.SchoolRegistration;
import com.role.implementation.repository.SchoolRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolRegistrationService {

    @Autowired
    private SchoolRegistrationRepository repository;

    // Save SchoolRegistration entity to the database
    public SchoolRegistration save(SchoolRegistration schoolRegistration) {
        return repository.save(schoolRegistration);
    }
}
