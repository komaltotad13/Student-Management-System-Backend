package com.project.student_management_system.repository;

import com.project.student_management_system.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SubjectRepository extends MongoRepository<Subject, String> {
    List<Subject> findByGradeName(String gradeName); // Update this method
    List<Subject> findByTeacherEmail(String teacherEmail);
}

