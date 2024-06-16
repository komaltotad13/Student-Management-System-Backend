//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Admin;
//import com.project.student_management_system.repository.AdminRepository;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.StudentRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/admin")
//public class AdminController {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @Autowired
//    private GradeRepository classRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Admin admin) {
//        Admin foundAdmin = adminRepository.findByEmail(admin.getEmail());
//        if (foundAdmin != null && foundAdmin.getPassword().equals(admin.getPassword())) {
//            return ResponseEntity.ok("Admin logged in successfully");
//        }
//        return ResponseEntity.status(401).body("Invalid credentials");
//    }
//
//    @GetMapping("/stats")
//    public ResponseEntity<Map<String, Long>> getStats() {
//        Map<String, Long> stats = new HashMap<>();
//        stats.put("students", studentRepository.count());
//        stats.put("teachers", teacherRepository.count());
//        stats.put("classes", classRepository.count());
//        return ResponseEntity.ok(stats);
//    }
//}



//package com.project.student_management_system.controller;
//import com.project.student_management_system.model.Admin;
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.repository.AdminRepository;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.StudentRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/admin")
//public class AdminController {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @Autowired
//    private GradeRepository gradeRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Admin admin) {
//        Admin foundAdmin = adminRepository.findByEmail(admin.getEmail());
//        if (foundAdmin != null && foundAdmin.getPassword().equals(admin.getPassword())) {
//            return ResponseEntity.ok("Admin logged in successfully");
//        }
//        return ResponseEntity.status(401).body("Invalid credentials");
//    }
//
//    @GetMapping("/stats")
//    public ResponseEntity<Map<String, Long>> getStats() {
//        Map<String, Long> stats = new HashMap<>();
//        stats.put("students", studentRepository.count());
//        stats.put("teachers", teacherRepository.count());
//        stats.put("classes", gradeRepository.count());
//        return ResponseEntity.ok(stats);
//    }
//
//    @GetMapping("/grades")
//    public List<Grade> getGrades() {
//        return gradeRepository.findAll();
//    }
//
//    @PostMapping("/grades")
//    public ResponseEntity<String> createGrade(@RequestBody Grade grade) {
//        gradeRepository.save(grade);
//        return ResponseEntity.ok("Grade created successfully");
//    }
//
//    @DeleteMapping("/grades/{id}")
//    public ResponseEntity<String> deleteGrade(@PathVariable String id) {
//        Optional<Grade> grade = gradeRepository.findById(id);
//        if (grade.isPresent()) {
//            gradeRepository.delete(grade.get());
//            return ResponseEntity.ok("Grade deleted successfully");
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Grade not found");
//        }
//    }
//}


// [newest]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Admin;
//import com.project.student_management_system.repository.AdminRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/admin")
//public class AdminController {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Admin admin) {
//        Admin existingAdmin = adminRepository.findByEmail(admin.getEmail());
//        if (existingAdmin != null && existingAdmin.getPassword().equals(admin.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//}

// [newest - 1]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Admin;
//import com.project.student_management_system.repository.AdminRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/admin")
//@CrossOrigin(origins = "http://localhost:3000")
//public class AdminController {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Admin admin) {
//        Admin existingAdmin = adminRepository.findByEmail(admin.getEmail());
//        if (existingAdmin != null && existingAdmin.getPassword().equals(admin.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//}

// [newest - 2]
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

