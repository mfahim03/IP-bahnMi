package com.role.implementation.repository;

import com.role.implementation.model.SchoolRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRegistrationRepository extends JpaRepository<SchoolRegistration, Long> {
}
