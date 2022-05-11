package com.upb.rsf.LandBnB.services;

import com.upb.rsf.LandBnB.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User u);
}
