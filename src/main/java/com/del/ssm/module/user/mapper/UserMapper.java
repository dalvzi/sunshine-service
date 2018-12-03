package com.del.ssm.module.user.mapper;

import com.del.ssm.module.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

//    @Insert("insert into dell_user(username,password) values (#{username},#{password})")
    Integer add(User user);

//    @Select("select * from dell_user where id=#{id}")
    User get(Integer id);



}
