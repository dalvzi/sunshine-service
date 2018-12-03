package com.del.ssm.module.log.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logger {

    private String account;
    private String username;
    //操作，比如登录,新添更改删除记录等
    private String operation;
    //操作详细
    private String operateContent;
    private String operateTime;

}
