package com.wxy.service.impl;

import com.wxy.dao.UserMapper;
import com.wxy.model.domain.User;
import com.wxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }
}