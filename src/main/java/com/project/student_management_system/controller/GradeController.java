//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.model.Student;
//import com.project.student_management_system.model.Subject;
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.StudentRepository;
//import com.project.student_management_system.repository.SubjectRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/grades")
//@CrossOrigin(origins = "http://localhost:3000")
//public class GradeController {
//
//    @Autowired
//    private GradeRepository gradeRepository;
//
//    @Autowired
//    private SubjectRepository subjectRepository;
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @GetMapping
//    public List<Grade> getAllGrades() {
//        return gradeRepository.findAll();
//    }
//
//    @PostMapping
//    public Grade createGrade(@RequestBody Grade grade) {
//        return gradeRepository.save(grade);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteGrade(@PathVariable String id) {
//        gradeRepository.deleteById(id);
//    }
//
//    @GetMapping("/{id}")
//    public Grade getGradeById(@PathVariable String id) {
//        return gradeRepository.findById(id).orElse(null);
//    }
//
//    @GetMapping("/{id}/subjects")
//    public List<Subject> getSubjectsByGradeId(@PathVariable String id) {
//        return subjectRepository.findByGradeId(id);
//    }
//
//    @GetMapping("/{id}/students")
//    public List<Student> getStudentsByGradeId(@PathVariable String id) {
//        return studentRepository.findByGradeId(id);
//    }
//
//    @GetMapping("/{id}/teachers")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String id) {
//        return teacherRepository.findByGradeId(id);
//    }
//
//    @GetMapping("/stats")
//    public Map<String, Long> getStats() {
//        long gradeCount = gradeRepository.count();
//        long studentCount = studentRepository.count();
//        long teacherCount = teacherRepository.count();
//
//        Map<String, Long> stats = new HashMap<>();
//        stats.put("grades", gradeCount);
//        stats.put("students", studentCount);
//        stats.put("teachers", teacherCount);
//
//        return stats;
//    }
//}

//===============================================================================
package com.project.student_management_system.controller;

import com.project.student_management_system.model.Grade;
import com.project.student_management_system.model.Student;
import com.project.student_management_system.model.Subject;
import com.project.student_management_system.model.Teacher;
import com.project.student_management_system.repository.GradeRepository;
import com.project.student_management_system.repository.StudentRepository;
import com.project.student_management_system.repository.SubjectRepository;
import com.project.student_management_system.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/grades")
@CrossOrigin(origins = "http://localhost:3000")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    @PostMapping
    public Grade createGrade(@RequestBody Grade grade) {
        return gradeRepository.save(grade);
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable String id) {
        gradeRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable String id) {
        return gradeRepository.findById(id).orElse(null);
    }

    @GetMapping("/{id}/subjects")
    public List<Subject> getSubjectsByGradeId(@PathVariable String id) {
        Grade grade = gradeRepository.findById(id).orElse(null);
        if (grade != null) {
            return subjectRepository.findByGradeName(grade.getName());
        }
        return null; // or throw an exception
    }

    @GetMapping("/{id}/students")
    public List<Student> getStudentsByGradeId(@PathVariable String id) {
        Grade grade = gradeRepository.findById(id).orElse(null);
        if (grade != null) {
            return studentRepository.findByGradeName(grade.getName());
        }
        return null; // or throw an exception
    }

    @GetMapping("/{id}/teachers")
    public List<Teacher> getTeachersByGradeId(@PathVariable String id) {
        Grade grade = gradeRepository.findById(id).orElse(null);
        if (grade != null) {
            return teacherRepository.findByGradeName(grade.getName());
        }
        return null; // or throw an exception
    }

    @GetMapping("/stats")
    public Map<String, Long> getStats() {
        long gradeCount = gradeRepository.count();
        long studentCount = studentRepository.count();
        long teacherCount = teacherRepository.count();

        Map<String, Long> stats = new HashMap<>();
        stats.put("grades", gradeCount);
        stats.put("students", studentCount);
        stats.put("teachers", teacherCount);

        return stats;
    }

    @GetMapping("/check/{name}")
    public boolean checkGradeNameExists(@PathVariable String name) {
        return gradeRepository.existsByName(name);
    }

//    @GetMapping("/teacher/{email}")
//    public Grade getGradeByTeacherEmail(@PathVariable String email) {
//        return gradeRepository.findByClassTeacher(email);
//    }

    @GetMapping("/teacher")
    public Grade getGradeByTeacherEmail(@RequestParam String email) {
        return gradeRepository.findByClassTeacher(email);
    }
}
