package com.project.student_management_system.repository;

import com.project.student_management_system.model.LoggedInTeacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoggedInTeacherRepository extends MongoRepository<LoggedInTeacher, String> {
    void deleteByEmail(String email);
}