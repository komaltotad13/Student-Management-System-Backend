package com.project.student_management_system.repository;

import com.project.student_management_system.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
    Teacher findByEmail(String email);
    List<Teacher> findByGradeName(String gradeName);
}


