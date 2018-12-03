package com.del.ssm.module.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String account;
    private String username;
    private String password;
    //用户状态,比如停用
    private String status;
    //用户类型
    private String userType;

}
