package com.example.jpa.service.impl;

import com.example.jpa.entity.Student;
import com.example.jpa.repo.StudentRepository;
import com.example.jpa.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
        //Salam
    }

    @Override
    public Student getById(Integer id) {
        return studentRepository.findById(id).get();
    }
}
