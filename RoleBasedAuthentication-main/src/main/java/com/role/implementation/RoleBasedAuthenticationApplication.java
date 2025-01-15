package com.role.implementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.role.implementation"})
@EntityScan(basePackages = {"com.role.implementation.model"}) // Scan for entities
@EnableJpaRepositories(basePackages = {"com.role.implementation.repository"}) // Scan for repositories
public class RoleBasedAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoleBasedAuthenticationApplication.class, args);
    }
}