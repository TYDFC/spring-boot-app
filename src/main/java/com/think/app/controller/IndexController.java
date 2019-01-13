package com.think.app.controller;


import com.github.pagehelper.PageInfo;
import com.think.app.model.User;
import com.think.app.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    public UserService userService;

    @ApiOperation(value="Hello World",httpMethod = "POST",notes = "测试数据")
    @RequestMapping("users")
    public String index(){
        PageInfo<User> users= userService.findAllUser(1,10);
        return users.toString();
    }



}
