package org.example.service;

import org.example.mapper.UserMapper;
import org.example.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User queryUserByUser(String userName,String password) {
        return userMapper.queryUserByUser(userName,password);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

}
