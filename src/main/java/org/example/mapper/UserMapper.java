package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    //增加一个User
    int addUser(User user);

    //更新User
    int updateUser(User user);

    //根据user查询,返回一个User
    User queryUserByUser(@Param("userName") String userName, @Param("password") String password);

    //查询全部User,返回list集合
    List<User> queryAllUser();
}
