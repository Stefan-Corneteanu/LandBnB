package com.upb.rsf.LandBnB.services;

import com.upb.rsf.LandBnB.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User u);
}
