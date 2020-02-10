package com.example.springbootdemo.models;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "dm_item")
public class Item extends BaseModel {

    @Column(nullable = false)
    private String itemName;

    @OneToOne(cascade=CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "itemId")
    private ItemTrigger itemTrigger;
}
