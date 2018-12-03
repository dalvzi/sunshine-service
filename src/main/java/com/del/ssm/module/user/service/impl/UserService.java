package com.del.ssm.module.user.service.impl;

import com.del.ssm.module.user.entity.User;
import com.del.ssm.module.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Integer register(User user) {
        return userMapper.add(user);
    }

    public Integer checkUsername(String username) {
        return null;
    }

    public User checkLog(Integer id) {
        return userMapper.get(id);
    }


}
