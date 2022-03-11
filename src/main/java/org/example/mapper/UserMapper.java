package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    //����һ��User
    int addUser(User user);

    //����User
    int updateUser(User user);

    //����user��ѯ,����һ��User
    User queryUserByUser(@Param("userName") String userName, @Param("password") String password);

    //��ѯȫ��User,����list����
    List<User> queryAllUser();
}
