package com.upb.rsf.LandBnB.services;

import com.upb.rsf.LandBnB.domain.Estate;

import java.util.List;

public interface EstateService {
    List<Estate> findAll();
    void save(Estate e);
}
