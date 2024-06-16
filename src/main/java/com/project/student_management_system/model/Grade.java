//package com.project.student_management_system.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.List;
//
//@Document(collection = "grades")
//public class Grade {
//    @Id
//    private String id;
//    private String name;
//    private List<String> students;
//    private List<String> subjects;
//    private List<String> teachers;
//
//    // Getters and Setters
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<String> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<String> students) {
//        this.students = students;
//    }
//
//    public List<String> getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(List<String> subjects) {
//        this.subjects = subjects;
//    }
//
//    public List<String> getTeachers() {
//        return teachers;
//    }
//
//    public void setTeachers(List<String> teachers) {
//        this.teachers = teachers;
//    }
//}


package com.project.student_management_system.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "grades")
public class Grade {
    @Id
    private String id;
    private String name;
    private String classTeacher;
    private List<String> students;
    private List<String> subjects;
    private List<String> teachers;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<String> teachers) {
        this.teachers = teachers;
    }
}
