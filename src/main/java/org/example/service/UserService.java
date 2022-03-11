package org.example.service;

import org.example.pojo.User;

import java.util.List;

public interface UserService {
    //����һ��User
    int addUser(User user);

    //����User
    int updateUser(User user);

    //����user��ѯ,����һ��User
    User queryUserByUser(String userName,String password);

    //��ѯȫ��User,����list����
    List<User> queryAllUser();
}
