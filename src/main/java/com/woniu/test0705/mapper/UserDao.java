package com.woniu.test0705.mapper;

import com.woniu.test0705.entity.User;

import java.util.List;

/**
 * Create on 2021/7/5
 *
 * @author eli
 * @date 2021年07月05日14:05
 * @Description:
 */
public interface UserDao {
    List<User> userList();

    void addUser(User user);

    void updateUser(User user);

    void update(User user);

    User findOne(Integer uid);
}
