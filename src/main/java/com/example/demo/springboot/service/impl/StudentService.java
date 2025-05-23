package com.example.demo.springboot.service.impl;

import com.example.demo.springboot.model.Student;
import com.example.demo.springboot.repository.IStudentRepository;
import com.example.demo.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
