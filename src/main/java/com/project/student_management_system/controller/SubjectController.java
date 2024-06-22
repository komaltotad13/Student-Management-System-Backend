package com.project.student_management_system.controller;

import com.project.student_management_system.model.Subject;
import com.project.student_management_system.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
@CrossOrigin(origins = "http://localhost:3000")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable String id) {
        subjectRepository.deleteById(id);
    }

    @GetMapping("/teacher")
    public List<Subject> getSubjectsByTeacherEmail(@RequestParam String email) {
        return subjectRepository.findByTeacherEmail(email);
    }
}
