package com.capgemini.mm.springboot.repo;

import com.capgemini.mm.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmail(String email);

}