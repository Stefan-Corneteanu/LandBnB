package com.upb.rsf.LandBnB.repositories;

import com.upb.rsf.LandBnB.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
