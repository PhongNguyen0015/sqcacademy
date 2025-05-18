package com.example.demo.springboot.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//exception do ltv tự định nghĩa
public class ApiException extends RuntimeException{
    ErrorCode errorCode;

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage()); //log lỗi cho backend dễ kiểm tra
        this.errorCode = errorCode;
    }
}
