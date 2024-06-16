//package com.project.student_management_system.repository;
//
//import com.project.student_management_system.model.Student;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//public interface StudentRepository extends MongoRepository<Student, String> {
//    Student findByRegistrationNumber(String registrationNumber);
//}

// [newest - 2]
//package com.project.student_management_system.repository;
//
//import com.project.student_management_system.model.Student;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import java.util.List;
//
//public interface StudentRepository extends MongoRepository<Student, String> {
//    Student findByRegistrationNumber(String registrationNumber);
//    List<Student> findByGradeId(String gradeId);
//}

// [newest - 3]
package com.project.student_management_system.repository;

import com.project.student_management_system.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByRegistrationNumber(String registrationNumber);
    List<Student> findByGradeName(String gradeName);
}


