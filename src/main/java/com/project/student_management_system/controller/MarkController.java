package com.project.student_management_system.controller;

import com.project.student_management_system.model.Mark;
import com.project.student_management_system.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/marks")
@CrossOrigin(origins = "http://localhost:3000")
public class MarkController {

    @Autowired
    private MarkRepository markRepository;

    @PostMapping
    public Mark createOrUpdateMark(@RequestBody Mark mark) {
        List<Mark> existingMarks = markRepository.findByRegistrationNumberAndSubject(mark.getRegistrationNumber(), mark.getSubject());
        if (!existingMarks.isEmpty()) {
            Mark existingMark = existingMarks.get(0);
            existingMark.setFa1(mark.getFa1());
            existingMark.setFa2(mark.getFa2());
            existingMark.setFinalMark(mark.getFinalMark());
            return markRepository.save(existingMark);
        }
        return markRepository.save(mark);
    }

    @GetMapping("/grade/{gradeName}/subject/{subject}")
    public List<Mark> getMarksByGradeAndSubject(@PathVariable String gradeName, @PathVariable String subject) {
        return markRepository.findByGradeNameAndSubject(gradeName, subject);
    }

    @GetMapping("/student/{registrationNumber}")
    public List<Mark> getMarksByStudent(@PathVariable String registrationNumber) {
        return markRepository.findByRegistrationNumber(registrationNumber);
    }
}