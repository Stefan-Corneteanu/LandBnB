package com.upb.rsf.LandBnB.services;

import com.upb.rsf.LandBnB.domain.Role;
import com.upb.rsf.LandBnB.domain.User;
import com.upb.rsf.LandBnB.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
        List<User> userList = new ArrayList<>(List.of(
                new User("Rami","somepassword","Rami_r@yaho.com","0777777776", Role.admin),
                new User("Stefan","randpassword","Stefan_c@yaho.com","0777777777", Role.admin),
                new User("Fadi","adminpassword","Fadi_r@yaho.com","0777777778", Role.admin)
        ));


         */
    @Override
    public List<User> findAll() {
        return (List) userRepository.findAll();
        //return userList;
    }

    @Override
    public User save(User u) {
        return userRepository.save(u);
        //userList.add(u);
    }
}
