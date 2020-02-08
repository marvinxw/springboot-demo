package com.example.springbootdemo.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @Id
    @Column(nullable = false, columnDefinition = "int(11) UNSIGNED COMMENT '自增长ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
      所以这里需要insertable = false,updatable = false，这样jpa更新插入时就不会去更新这个字段了，而是完全由数据库维护。
    */
    @CreationTimestamp
    @Column(nullable = false, insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'")
    private LocalDateTime createdAt;

    @Column(nullable = false, insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
