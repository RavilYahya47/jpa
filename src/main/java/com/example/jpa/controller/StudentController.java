package com.example.jpa.controller;

import com.example.jpa.entity.Student;
import com.example.jpa.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
@GetMapping("/getStudents")
    public List<Student>getAll(){
        return studentService.getAll();
    }
    @GetMapping("/getStudentById/{id}")
    public Student getById(@PathVariable Integer id){
        return studentService.getById(id);
    }

}
