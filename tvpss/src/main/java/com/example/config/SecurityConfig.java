package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/", "/home", "/video", "/management").permitAll() // Allow access to these endpoints
                .anyRequest().authenticated() // Secure all other endpoints
            )
            .formLogin((form) -> form
                .loginPage("/login") // Custom login page
                .permitAll()
            )
            .logout((logout) -> logout.permitAll());

        return http.build();
    }
}