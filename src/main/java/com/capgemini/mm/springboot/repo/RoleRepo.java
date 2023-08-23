package com.capgemini.mm.springboot.repo;

import com.capgemini.mm.springboot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}