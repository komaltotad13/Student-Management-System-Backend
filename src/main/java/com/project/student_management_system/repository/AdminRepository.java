package com.project.student_management_system.repository;

import com.project.student_management_system.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {
    Admin findByEmail(String email);
}
