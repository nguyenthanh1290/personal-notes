package com.thanhn.demo.entity;

import com.thanhn.demo.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "User")
@Table(name = "user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
