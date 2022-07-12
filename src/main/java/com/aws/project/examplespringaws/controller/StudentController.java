package com.aws.project.examplespringaws.controller;

import com.aws.project.examplespringaws.model.entity.Student;
import com.aws.project.examplespringaws.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/list/v1")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getStudentList();
        return ResponseEntity.ok(students);
    }
}
