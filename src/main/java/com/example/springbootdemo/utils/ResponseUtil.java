package com.example.springbootdemo.utils;

import com.example.springbootdemo.common.ApiResponse;

public class ResponseUtil {

    public static <T> ApiResponse success(T data) {
        return new ApiResponse<>(200, ApiResponse.OK, ApiResponse.SUCCESS, data);
    }

    public static <T> ApiResponse success(T data, String message) {
        return new ApiResponse<>(200, ApiResponse.OK, message, data);
    }

    public static ApiResponse error(String message) {
        return new ApiResponse<>(200, ApiResponse.ERROR, message, null);
    }

    public static ApiResponse error(int code, String message) {
        return new ApiResponse<>(code, ApiResponse.ERROR, message, null);
    }

}
