package com.project.student_management_system.repository;

import com.project.student_management_system.model.LoggedInStudent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoggedInStudentRepository extends MongoRepository<LoggedInStudent, String> {
    LoggedInStudent findByRegistrationNumber(String registrationNumber);
}