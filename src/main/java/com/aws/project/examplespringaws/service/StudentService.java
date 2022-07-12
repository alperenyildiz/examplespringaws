package com.aws.project.examplespringaws.service;

import com.aws.project.examplespringaws.dao.jpa.StudentRepository;
import com.aws.project.examplespringaws.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentList(){

        return studentRepository.findAll();
    }
}
