package com.upb.rsf.LandBnB.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String password;
    private String email;
    private String phoneNo;
    private Role role;

    public User(String name, String password, String email, String phoneNo, Role role) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.role = role;
    }
}
