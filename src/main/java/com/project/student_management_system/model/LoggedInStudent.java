package com.project.student_management_system.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "LoggedInStudent")
public class LoggedInStudent {
    @Id
    private String id;
    private String registrationNumber;

    public LoggedInStudent() {}

    public LoggedInStudent(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

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
}