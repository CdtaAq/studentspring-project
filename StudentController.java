package com.example.studentproject.controller;

import com.example.studentproject.model.Student;
import com.example.studentproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
}
