package com.wxy.service;

import com.wxy.model.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void insert(User user);

    void update(User user);

    User findById(int id);

    void delete(int id);
}