//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/student")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Student student) {
//        Student foundStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (foundStudent != null && foundStudent.getPassword().equals(student.getPassword())) {
//            return ResponseEntity.ok("Student logged in successfully");
//        }
//        return ResponseEntity.status(401).body("Invalid credentials");
//    }
//}


//package com.project.student_management_system.controller;
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/student")
//@CrossOrigin(origins = "http://localhost:3000")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Student student) {
//        Student foundStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (foundStudent != null && foundStudent.getPassword().equals(student.getPassword())) {
//            return ResponseEntity.ok("Student logged in successfully");
//        }
//        return ResponseEntity.status(401).body("Invalid credentials");
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentRepository.deleteById(id);
//    }
//}

// [newest]
// src/main/java/com/project/student_management_system/controller/StudentController.java
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/student")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Student student) {
//        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//}


// [newest - 1]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/students")
//@CrossOrigin(origins = "http://localhost:3000")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Student student) {
//        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Student> getStudentsByGradeId(@PathVariable String gradeId) {
//        return studentRepository.findByGradeId(gradeId);
//    }
//}

// [newest - 2]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/students")
//@CrossOrigin(origins = "http://localhost:3000")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Student student) {
//        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Student> getStudentsByGradeId(@PathVariable String gradeId) {
//        return studentRepository.findByGradeId(gradeId);
//    }
//}

// [newest - 3]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/students")
//@CrossOrigin(origins = "http://localhost:3000")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Autowired
//    private GradeRepository gradeRepository; // Add this to fetch grade names
//
//    @PostMapping("/login")
//    public String login(@RequestBody Student student) {
//        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Student> getStudentsByGradeId(@PathVariable String gradeId) {
//        Grade grade = gradeRepository.findById(gradeId).orElse(null);
//        if (grade != null) {
//            return studentRepository.findByGradeName(grade.getName());
//        }
//        return null; // or throw an exception
//    }
//}


//===============================================================================
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/students")
//@CrossOrigin(origins = "http://localhost:3000")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Student student) {
//        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeName}")
//    public List<Student> getStudentsByGradeName(@PathVariable String gradeName) {
//        return studentRepository.findByGradeName(gradeName);
//    }
//}

//===============================================================================
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/students")
//@CrossOrigin(origins = "http://localhost:3000")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Student student) {
//        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
//        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeName}")
//    public List<Student> getStudentsByGradeName(@PathVariable String gradeName) {
//        return studentRepository.findByGradeName(gradeName);
//    }
//
//    @PutMapping("/{id}/attendance")
//    public Student updateAttendance(@PathVariable String id, @RequestBody Map<String, Object> attendanceData) {
//        Student student = studentRepository.findById(id).orElse(null);
//        if (student != null) {
//            String attendanceStatus = (String) attendanceData.get("attendanceStatus");
//            if (attendanceStatus.equals("present")) {
//                int presentCount = student.getPresentCount();
//                student.setPresentCount(presentCount + 1);
//            } else if (attendanceStatus.equals("absent")) {
//                int absentCount = student.getAbsentCount();
//                student.setAbsentCount(absentCount + 1);
//            }
//            return studentRepository.save(student);
//        }
//        return null;
//    }
//}

//============================================================================================================
package com.project.student_management_system.controller;

import com.project.student_management_system.model.Student;
import com.project.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/login")
    public String login(@RequestBody Student student) {
        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
            return "Login successful";
        }
        return "Invalid credentials";
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/grade/{gradeName}")
    public List<Student> getStudentsByGradeName(@PathVariable String gradeName) {
        return studentRepository.findByGradeName(gradeName);
    }

    @PutMapping("/{id}/attendance")
    public Student updateAttendance(@PathVariable String id, @RequestBody Map<String, Object> attendanceData) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            String attendanceStatus = (String) attendanceData.get("attendanceStatus");
            if ("present".equals(attendanceStatus)) {
                student.setPresentCount(student.getPresentCount() + 1);
            } else if ("absent".equals(attendanceStatus)) {
                student.setAbsentCount(student.getAbsentCount() + 1);
            }
            return studentRepository.save(student);
        }
        return null;
    }
}
