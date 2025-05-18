package com.example.demo.springboot.controller;

import com.example.demo.springboot.dto.ApiResponse;
import com.example.demo.springboot.entity.Student;
import com.example.demo.springboot.exception.ApiException;
import com.example.demo.springboot.exception.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    // giả lập data
    private List<Student> students = new ArrayList(
            Arrays.asList(new Student(1, "Hồ Văn Trung", 9.6 ),
                        new Student(2, "Ngọc Mai", 9.0 ),
                        new Student(3, "Mai Phương", 9.7 ))
    );
    @GetMapping
    public ResponseEntity<ApiResponse<List<Student>>> getStudents() {

        return ResponseEntity.ok(new ApiResponse<>(null, null, students));
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
    public ResponseEntity<ApiResponse<Student>> getById(@PathVariable(name = "id") int ids) {
        for(Student s : students) {
            if(s.getId() == ids) {
//                return ResponseEntity.status(HttpStatus.OK).body(s);
                ApiResponse apiResponse = ApiResponse.builder().data(s).build();
                return ResponseEntity.ok(apiResponse);
//                return ResponseEntity.ok(new ApiResponse<>(20001, "Thành công", s));
            }
        }
        //thường đc xem là exception
        throw new ApiException(ErrorCode.STUDENT_NOT_EXIST);
//        return ResponseEntity.status(ErrorCode.STUDENT_NOT_EXIST.getStatus()).body(
//                ApiResponse.<Student>builder()
//                        .code(ErrorCode.STUDENT_NOT_EXIST.getCode())
//                        .message(ErrorCode.STUDENT_NOT_EXIST.getMessage())
//                        .build());
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student) {
        student.setId((int) (Math.random() * 10000000));
        students.add(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }
}
