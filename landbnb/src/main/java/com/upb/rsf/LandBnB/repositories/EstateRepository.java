package com.upb.rsf.LandBnB.repositories;

import com.upb.rsf.LandBnB.domain.Estate;
import org.springframework.data.repository.CrudRepository;

public interface EstateRepository extends CrudRepository<Estate,Long> {
}
