package com.just4cool.service.impl;

import com.just4cool.dao.UserDao;
import com.just4cool.entity.User;
import com.just4cool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hubin on 2018/8/2.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(long id) {
        return userDao.selectById(id);
    }
}
