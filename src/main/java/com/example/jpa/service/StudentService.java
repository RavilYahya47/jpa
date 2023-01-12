package com.example.jpa.service;

import com.example.jpa.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student>getAll();

    Student getById (Integer id);
}
