package com.capgemini.mm.springboot.service;

import com.capgemini.mm.springboot.dto.UserDto;
import com.capgemini.mm.springboot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}