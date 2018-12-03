package com.del.ssm.module.user.service;

import com.del.ssm.module.user.entity.User;

public interface IUserService {

    Integer checkAccount(String account);

    Integer checkUsername(String username);

    Integer register(User user);

    User checkLog(Integer id);


}
