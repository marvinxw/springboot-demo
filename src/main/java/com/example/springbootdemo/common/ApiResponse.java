package com.example.springbootdemo.common;

import java.io.Serializable;

public class ApiResponse<T> implements Serializable {

    public static final Integer OK = 1;
    public static final String SUCCESS = "success";
    public static final String FAILED = "failed";
    public static final Integer ERROR = -1;

    private Integer code;

    private Integer status;

    private String message;

    private T data;

    public static Integer getOK() {
        return OK;
    }

    public static String getSUCCESS() {
        return SUCCESS;
    }

    public static String getFAILED() {
        return FAILED;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResponse(Integer code, Integer status, String message, T data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
