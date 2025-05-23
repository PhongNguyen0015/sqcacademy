package com.example.demo.springboot.repository.impl;

import com.example.demo.springboot.model.Student;
import com.example.demo.springboot.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class StudentRepository implements IStudentRepository {
    // giả lập data, thực tế là lấy từ DB
    private List<Student> students = new ArrayList(
            Arrays.asList(new Student(1, "Hồ Văn Trung", 9.6 ),
                    new Student(2, "Ngọc Mai", 9.0 ),
                    new Student(3, "Mai Phương", 9.7 ))
    );
    @Override
    public List<Student> findAll() {
        return students;
    }
    @Override
    public Student findById(int id) {
        for(Student student : students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student save(Student student) {
        student.setId((int) (Math.random() * 10000000));
        students.add(student);
        return student;
    }
}
