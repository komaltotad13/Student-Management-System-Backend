package com.project.student_management_system.controller;

import com.project.student_management_system.model.LoggedInStudent;
import com.project.student_management_system.model.Student;
import com.project.student_management_system.repository.LoggedInStudentRepository;
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

    @Autowired
    private LoggedInStudentRepository loggedInStudentRepository;

    @PostMapping("/login")
    public String login(@RequestBody Student student) {
        Student existingStudent = studentRepository.findByRegistrationNumber(student.getRegistrationNumber());
        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
            LoggedInStudent loggedInStudent = new LoggedInStudent(student.getRegistrationNumber());
            loggedInStudentRepository.save(loggedInStudent);
            return "Login successful";
        }
        return "Invalid credentials";
    }

    @PostMapping("/logout")
    public String logout() {
        LoggedInStudent loggedInStudent = loggedInStudentRepository.findAll().stream().findFirst().orElse(null);
        if (loggedInStudent != null) {
            loggedInStudentRepository.delete(loggedInStudent);
            return "Logout successful";
        }
        return "No logged-in student found";
    }

    @GetMapping("/loggedInStudent")
    public Student getLoggedInStudent() {
        LoggedInStudent loggedInStudent = loggedInStudentRepository.findAll().stream().findFirst().orElse(null);
        if (loggedInStudent != null) {
            Student student = studentRepository.findByRegistrationNumber(loggedInStudent.getRegistrationNumber());
            // Ensure sensitive information like password is not sent to the frontend
            student.setPassword(null);
            return student;
        }
        return null;
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

    @PutMapping("/{id}/marks")
    public Student updateMarks(@PathVariable String id, @RequestBody Map<String, Object> marksData) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            // Assuming you'll send FA1, FA2, and Final marks
            student.setFa1((Integer) marksData.get("fa1"));
            student.setFa2((Integer) marksData.get("fa2"));
            student.setFinalMark((Integer) marksData.get("finalMark"));
            return studentRepository.save(student);
        }
        return null;
    }
}
