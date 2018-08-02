package com.just4cool.dao;

import com.just4cool.entity.User;

/**
 * Created by hubin on 2018/8/2.
 */
public interface UserDao {

    User selectById(long id);

}
