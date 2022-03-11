package org.example.service;

import org.example.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int updateUser(User user);

    User queryUserByUserName(String userName);

    List<User> queryAllUser();
}
