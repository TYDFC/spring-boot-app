package com.think.app.service.user;

import com.github.pagehelper.PageInfo;
import com.think.app.model.User;

public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}

