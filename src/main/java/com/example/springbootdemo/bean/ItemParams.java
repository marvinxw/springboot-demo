package com.example.springbootdemo.bean;

import lombok.Data;

@Data
public class ItemParams {

    private String itemName;

    private ItemTriggerParams itemTriggerParams;
}
