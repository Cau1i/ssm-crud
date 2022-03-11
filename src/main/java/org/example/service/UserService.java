package org.example.service;

import org.example.pojo.User;

import java.util.List;

public interface UserService {
    //增加一个User
    int addUser(User user);

    //更新User
    int updateUser(User user);

    //根据user查询,返回一个User
    User queryUserByUser(String userName,String password);

    //查询全部User,返回list集合
    List<User> queryAllUser();
}
