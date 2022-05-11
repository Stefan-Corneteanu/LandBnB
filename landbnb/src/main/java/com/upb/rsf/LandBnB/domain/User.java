package com.upb.rsf.LandBnB.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @EqualsAndHashCode.Include private String password;
    @EqualsAndHashCode.Include private String email;
    private String phoneNo;
    private Role role;

    //by default, when creating a user we should set the role as user
    public User(String name, String password, String email, String phoneNo) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.role = Role.user;
    }

    //for admin related purposes
    public User(String name, String password, String email, String phoneNo, Role role) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.role = role;
    }
}
