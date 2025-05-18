package com.example.demo.springboot.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    STUDENT_NOT_EXIST(40410, "không tìm thấy student", HttpStatus.NOT_FOUND),
    TEACHER_NOT_EXIST(40400, "không tìm thấy teacher", HttpStatus.NOT_FOUND)
    ;
    Integer code;
    String message;
    HttpStatus status;

}
