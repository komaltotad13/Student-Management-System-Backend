package com.project.student_management_system.controller;

import com.project.student_management_system.model.Admin;
import com.project.student_management_system.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/login")
    public String login(@RequestBody Admin admin) {
        Admin existingAdmin = adminRepository.findByEmail(admin.getEmail());
        if (existingAdmin != null && existingAdmin.getPassword().equals(admin.getPassword())) {
            return "Login successful";
        }
        return "Invalid credentials";
    }

    @GetMapping("/profile")
    public Admin getAdminProfile() {
        // Assuming there is only one admin in the database
        return adminRepository.findAll().get(0);
    }
}

