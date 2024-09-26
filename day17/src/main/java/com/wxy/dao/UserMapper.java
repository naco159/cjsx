package com.wxy.dao;

import com.wxy.model.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    @Update("UPDATE user SET name=#{name}, age=#{age} WHERE id=#{id}")
    void update(User user);

    @Select("SELECT * FROM user WHERE id=#{id}")
    User findById(int id);

    @Delete("DELETE FROM user WHERE id=#{id}")
    void delete(int id);
}