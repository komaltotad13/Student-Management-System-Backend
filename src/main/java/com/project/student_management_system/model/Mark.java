package com.project.student_management_system.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "marks")
public class Mark {
    @Id
    private String id;
    private String registrationNumber;
    private String subject;
    private String gradeName;
    private Integer fa1;
    private Integer fa2;
    private Integer finalMark;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getFa1() {
        return fa1;
    }

    public void setFa1(Integer fa1) {
        this.fa1 = fa1;
    }

    public Integer getFa2() {
        return fa2;
    }

    public void setFa2(Integer fa2) {
        this.fa2 = fa2;
    }

    public Integer getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Integer finalMark) {
        this.finalMark = finalMark;
    }
}