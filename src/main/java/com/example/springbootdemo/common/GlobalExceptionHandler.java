package com.example.springbootdemo.common;

import com.example.springbootdemo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse handle(Exception e) {
        return ResponseUtil.error(400, e.getMessage() == null ? "unknow error" : e.getMessage());
    }
}
