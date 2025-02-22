package com.role.implementation.repository;

import com.role.implementation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String emailId);

    List<User> findAllByOrderByNameAsc();

    List<User> findAllByOrderByAddressAsc();
}