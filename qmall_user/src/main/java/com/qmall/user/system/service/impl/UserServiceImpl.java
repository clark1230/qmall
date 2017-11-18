package com.qmall.user.system.service.impl;

import com.qmall.user.system.entity.User;
import com.qmall.user.system.mapper.UserMapper;
import com.qmall.user.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * 用户业务逻辑类
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    public int add(User user) {
        return userMapper.insertTbUser(user);
    }

    public int update(User user) {
        return 0;
    }

    public int deleteById(Serializable id) {
        return 0;
    }

    public User findById(Serializable id) {
        return null;
    }
}
