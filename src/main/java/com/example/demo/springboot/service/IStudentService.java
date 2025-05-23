package com.example.demo.springboot.service;

import com.example.demo.springboot.model.Student;

import java.util.List;

public interface IStudentService {
    // mặc định public, abstract
    List<Student> findAll();
    Student findById(int id);

    Student save(Student student);
}
