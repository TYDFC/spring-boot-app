package com.think.app.dao;

import com.think.app.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int insert(User record);

    List<User> selectUsers();

    User findUserById(int id);
}