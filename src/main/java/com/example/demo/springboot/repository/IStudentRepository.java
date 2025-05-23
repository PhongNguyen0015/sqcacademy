package com.example.demo.springboot.repository;

import com.example.demo.springboot.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    Student findById(int id);

    Student save(Student student);
}
