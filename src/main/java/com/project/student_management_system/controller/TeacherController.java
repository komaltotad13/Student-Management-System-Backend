//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/teacher")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Teacher teacher) {
//        Teacher foundTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (foundTeacher != null && foundTeacher.getPassword().equals(teacher.getPassword())) {
//            return ResponseEntity.ok("Teacher logged in successfully");
//        }
//        return ResponseEntity.status(401).body("Invalid credentials");
//    }
//}


//package com.project.student_management_system.controller;
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/teacher")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody Teacher teacher) {
//        Teacher foundTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (foundTeacher != null && foundTeacher.getPassword().equals(teacher.getPassword())) {
//            return ResponseEntity.ok("Teacher logged in successfully");
//        }
//        return ResponseEntity.status(401).body("Invalid credentials");
//    }
//
//    @PostMapping
//    public Teacher createTeacher(@RequestBody Teacher teacher) {
//        return teacherRepository.save(teacher);
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//}

// [newest]
// src/main/java/com/project/student_management_system/controller/TeacherController.java
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/teacher")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//}

// [newest - 1]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Teacher createTeacher(@RequestBody Teacher teacher) {
//        return teacherRepository.save(teacher);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        return teacherRepository.findByGradeId(gradeId);
//    }
//}


// [newest - 2]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public Teacher createTeacher(@RequestBody Teacher teacher) {
//        return teacherRepository.save(teacher);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        return teacherRepository.findByGradeId(gradeId);
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//}

// [newest - 2]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public String createTeacher(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null) {
//            return "Teacher with this email already exists";
//        }
//        teacherRepository.save(teacher);
//        return "Teacher created successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        return teacherRepository.findByGradeId(gradeId);
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//}

// [newest - 3]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @GetMapping("/email/{email}")
//    public Map<String, Boolean> checkTeacherByEmail(@PathVariable String email) {
//        Teacher teacher = teacherRepository.findByEmail(email);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("exists", teacher != null);
//        return response;
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public String createTeacher(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null) {
//            return "Teacher with this email already exists";
//        }
//        teacherRepository.save(teacher);
//        return "Teacher created successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        return teacherRepository.findByGradeId(gradeId);
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//}


// [newest - 3]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @Autowired
//    private GradeRepository gradeRepository; // Add this to fetch grade names
//
//    @GetMapping("/email/{email}")
//    public Map<String, Boolean> checkTeacherByEmail(@PathVariable String email) {
//        Teacher teacher = teacherRepository.findByEmail(email);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("exists", teacher != null);
//        return response;
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public String createTeacher(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null) {
//            return "Teacher with this email already exists";
//        }
//        teacherRepository.save(teacher);
//        return "Teacher created successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        Grade grade = gradeRepository.findById(gradeId).orElse(null);
//        if (grade != null) {
//            return teacherRepository.findByGradeName(grade.getName());
//        }
//        return null; // or throw an exception
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//}

// [newest - 3]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @Autowired
//    private GradeRepository gradeRepository; // Add this to fetch grade names
//
//    @GetMapping("/email/{email}")
//    public Map<String, Boolean> checkTeacherByEmail(@PathVariable String email) {
//        Teacher teacher = teacherRepository.findByEmail(email);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("exists", teacher != null);
//        return response;
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public String createTeacher(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null) {
//            return "Teacher with this email already exists";
//        }
//        teacherRepository.save(teacher);
//        return "Teacher created successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        Grade grade = gradeRepository.findById(gradeId).orElse(null);
//        if (grade != null) {
//            return teacherRepository.findByGradeName(grade.getName());
//        }
//        return null; // or throw an exception
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//}

// [newest - 4]
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @Autowired
//    private GradeRepository gradeRepository; // Add this to fetch grade names
//
//    @GetMapping("/email/{email}")
//    public Map<String, Boolean> checkTeacherByEmail(@PathVariable String email) {
//        Teacher teacher = teacherRepository.findByEmail(email);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("exists", teacher != null);
//        return response;
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public String createTeacher(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null) {
//            return "Teacher with this email already exists";
//        }
//        teacherRepository.save(teacher);
//        return "Teacher created successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        Grade grade = gradeRepository.findById(gradeId).orElse(null);
//        if (grade != null) {
//            return teacherRepository.findByGradeName(grade.getName());
//        }
//        return null; // or throw an exception
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//
//    @GetMapping("/loggedInTeacher")
//    public Teacher getLoggedInTeacher(@RequestParam String email) {
//        return teacherRepository.findByEmail(email);
//    }
//}

// =================================================================================
//package com.project.student_management_system.controller;
//
//import com.project.student_management_system.model.Grade;
//import com.project.student_management_system.model.Teacher;
//import com.project.student_management_system.repository.GradeRepository;
//import com.project.student_management_system.repository.TeacherRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/teachers")
//@CrossOrigin(origins = "http://localhost:3000")
//public class TeacherController {
//
//    @Autowired
//    private TeacherRepository teacherRepository;
//
//    @Autowired
//    private GradeRepository gradeRepository;
//
//    @GetMapping("/email/{email}")
//    public Map<String, Boolean> checkTeacherByEmail(@PathVariable String email) {
//        Teacher teacher = teacherRepository.findByEmail(email);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("exists", teacher != null);
//        return response;
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
//            return "Login successful";
//        }
//        return "Invalid credentials";
//    }
//
//    @PostMapping
//    public String createTeacher(@RequestBody Teacher teacher) {
//        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
//        if (existingTeacher != null) {
//            return "Teacher with this email already exists";
//        }
//        teacherRepository.save(teacher);
//        return "Teacher created successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTeacher(@PathVariable String id) {
//        teacherRepository.deleteById(id);
//    }
//
//    @GetMapping("/grade/{gradeId}")
//    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
//        Grade grade = gradeRepository.findById(gradeId).orElse(null);
//        if (grade != null) {
//            return teacherRepository.findByGradeName(grade.getName());
//        }
//        return null;
//    }
//
//    @GetMapping
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//
//    @GetMapping("/loggedInTeacher")
//    public Teacher getLoggedInTeacher(@RequestParam String email) {
//        return teacherRepository.findByEmail(email);
//    }
//}

//==========================================================================================
package com.project.student_management_system.controller;

import com.project.student_management_system.model.Grade;
import com.project.student_management_system.model.Teacher;
import com.project.student_management_system.repository.GradeRepository;
import com.project.student_management_system.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.student_management_system.model.LoggedInTeacher;
import com.project.student_management_system.repository.LoggedInTeacherRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/teachers")
@CrossOrigin(origins = "http://localhost:3000")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private LoggedInTeacherRepository loggedInTeacherRepository;

    @GetMapping("/email/{email}")
    public Map<String, Boolean> checkTeacherByEmail(@PathVariable String email) {
        Teacher teacher = teacherRepository.findByEmail(email);
        Map<String, Boolean> response = new HashMap<>();
        response.put("exists", teacher != null);
        return response;
    }

    @PostMapping("/login")
    public String login(@RequestBody Teacher teacher) {
        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
            LoggedInTeacher loggedInTeacher = new LoggedInTeacher(teacher.getEmail());
            loggedInTeacherRepository.save(loggedInTeacher);
            return "Login successful";
        }
        return "Invalid credentials";
    }

    @PostMapping
    public String createTeacher(@RequestBody Teacher teacher) {
        Teacher existingTeacher = teacherRepository.findByEmail(teacher.getEmail());
        if (existingTeacher != null) {
            return "Teacher with this email already exists";
        }
        teacherRepository.save(teacher);
        return "Teacher created successfully";
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable String id) {
        teacherRepository.deleteById(id);
    }

    @GetMapping("/grade/{gradeId}")
    public List<Teacher> getTeachersByGradeId(@PathVariable String gradeId) {
        Grade grade = gradeRepository.findById(gradeId).orElse(null);
        if (grade != null) {
            return teacherRepository.findByGradeName(grade.getName());
        }
        return null;
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @GetMapping("/loggedInTeacher")
    public List<LoggedInTeacher> getLoggedInTeacher() {
        return loggedInTeacherRepository.findAll();
    }

//    @GetMapping("/loggedInTeacherGrade")
//    public String getLoggedInTeacherGrade(@RequestParam String email) {
//        Grade grade = gradeRepository.findByClassTeacher(email);
//        if (grade != null) {
//            return grade.getName();
//        }
//        return null;
//    }

    @GetMapping("/loggedInTeacherGrade")
    public String getLoggedInTeacherGrade(@RequestParam String email) {
        Grade grade = gradeRepository.findByClassTeacher(email);
        if (grade != null) {
            return grade.getName();
        }
        return "Grade not found";
    }

    @PostMapping("/logout")
    public void logout() {
        loggedInTeacherRepository.deleteAll();
    }
}
