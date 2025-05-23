package com.example.demo.springboot.controller;

import com.example.demo.springboot.dto.ApiResponse;
import com.example.demo.springboot.model.Student;
import com.example.demo.springboot.exception.ApiException;
import com.example.demo.springboot.exception.ErrorCode;
import com.example.demo.springboot.service.IStudentService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class StudentController {
    //tiêm qua AllArgsConstructor
    IStudentService studentService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<Student>>> getStudents() {

        return ResponseEntity.ok(new ApiResponse<>(null, null, studentService.findAll()));
    }
//ko tìm thấy sinh viên vẫn trả về status 200, ko hợp lý
//    @RequestMapping("/students/{id}")
//    public Student getById(@PathVariable(name = "id") int ids) {
//        for(Student s : students) {
//            if(s.getId() == ids) {
//                return s;
//            }
//        }
//        return null;
//    }

    //viết lại dùng ResponseEntity
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Student>> getById(@PathVariable(name = "id") int id) {
        Student student = studentService.findById(id);
        if(student == null) {
            throw new ApiException(ErrorCode.STUDENT_NOT_EXIST);
        }
//        builder() là một Generic Method
        return ResponseEntity.ok(
                ApiResponse.<Student>builder().data(student).build());

        //thường đc xem là exception

//        return ResponseEntity.status(ErrorCode.STUDENT_NOT_EXIST.getStatus()).body(
//                ApiResponse.<Student>builder()
//                        .code(ErrorCode.STUDENT_NOT_EXIST.getCode())
//                        .message(ErrorCode.STUDENT_NOT_EXIST.getMessage())
//                        .build());
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Student>> save(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.<Student>builder().data(studentService.save(student)).build());
    }
}
