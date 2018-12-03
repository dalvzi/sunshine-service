package com.del.ssm.module.user.controller;

import com.del.ssm.module.user.entity.User;
import com.del.ssm.module.user.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/user")
public class UserContrller {


    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public Integer register() {

        User user = new User("name", "pass","","","");
        int flag = 0;
        flag = userService.register(user);

        System.out.print(flag);

        return flag;

    }

    @RequestMapping("/{id}")
    @ResponseBody
    public User get(@PathVariable(value = "id") Integer id) {

        User user = userService.checkLog(id);

        return user;

    }

}
