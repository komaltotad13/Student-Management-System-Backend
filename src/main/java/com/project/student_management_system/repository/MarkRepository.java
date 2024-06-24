package com.project.student_management_system.repository;

import com.project.student_management_system.model.Mark;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MarkRepository extends MongoRepository<Mark, String> {
    List<Mark> findByRegistrationNumberAndSubject(String registrationNumber, String subject);
    List<Mark> findByGradeNameAndSubject(String gradeName, String subject);
    List<Mark> findByRegistrationNumber(String registrationNumber);
}