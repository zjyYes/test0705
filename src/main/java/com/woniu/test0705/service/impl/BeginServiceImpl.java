package com.woniu.test0705.service.impl;

import com.woniu.test0705.entity.User;
import com.woniu.test0705.mapper.UserDao;
import com.woniu.test0705.service.BeginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Create on 2021/7/5
 *
 * @author eli
 * @date 2021年07月05日14:00
 * @Description:
 */
@Service
public class BeginServiceImpl implements BeginService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> userList() {
        return userDao.userList();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findOne(Integer uid) {
        return userDao.findOne(uid);
    }

}
