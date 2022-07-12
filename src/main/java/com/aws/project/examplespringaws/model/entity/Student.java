package com.aws.project.examplespringaws.model.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "STUDENT")
@Entity
@Data
public class Student {

    @Id
    @Column(name = "STUDENT_CODE")
    private String studentCode;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GPA")
    private double gpa;
}

