package com.example.springbootdemo.models;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "dm_item_trigger")
public class ItemTrigger extends BaseModel {

    @Column(nullable = false)
    private Long itemId;

    @Column(nullable = false)
    private String itemTriggerName;
}
