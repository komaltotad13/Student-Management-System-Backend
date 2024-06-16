package com.project.student_management_system.repository;

import com.project.student_management_system.model.Grade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends MongoRepository<Grade, String> {
    boolean existsByName(String name);
    Grade findByClassTeacher(String classTeacherEmail);
}

