package com.example.springbootdemo.bean;

import lombok.Data;
import lombok.NonNull;

@Data
public class ItemTriggerParams {

    @NonNull
    private String businessLine;
}
