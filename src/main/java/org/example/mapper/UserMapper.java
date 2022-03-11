package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    int addUser(User user);

    int updateUser(User user);

    User queryUserByUserName(@Param("userName") String userName);

    List<User> queryAllUser();
}
