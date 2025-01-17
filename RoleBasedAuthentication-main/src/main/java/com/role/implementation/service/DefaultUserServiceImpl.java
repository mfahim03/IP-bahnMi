package com.role.implementation.service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.role.implementation.DTO.UserProfileDTO;
import com.role.implementation.DTO.UserRegisteredDTO;
import com.role.implementation.model.Role;
import com.role.implementation.model.User;
import com.role.implementation.repository.RoleRepository;
import com.role.implementation.repository.UserRepository;

@Service
public class DefaultUserServiceImpl implements DefaultUserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRole()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Set<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRole())).collect(Collectors.toList());
    }

    @Override
    public User save(UserRegisteredDTO userRegisteredDTO) {
        Role role = roleRepo.findByRole(userRegisteredDTO.getRole());
        if (role == null) {
            role = new Role();
            role.setRole(userRegisteredDTO.getRole());
            roleRepo.save(role);
        }
        User user = new User();
        user.setEmail(userRegisteredDTO.getEmail_id());
        user.setName(userRegisteredDTO.getName());
        user.setPassword(passwordEncoder.encode(userRegisteredDTO.getPassword()));
        user.setRole(role);

        return userRepo.save(user);
    }

    @Override
    public User updateUserProfile(UserProfileDTO userProfileDTO) {
        User user = userRepo.findByEmail(userProfileDTO.getEmail());
        if (user != null) {
            user.setName(userProfileDTO.getName());
            user.setBio(userProfileDTO.getBio());
            user.setPhoneNumber(userProfileDTO.getPhoneNumber());
            user.setAddress(userProfileDTO.getAddress());
            return userRepo.save(user);
        }
        return null;
    }
}