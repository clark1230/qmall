package com.qmall.user.system.mapper;

import com.qmall.user.entity.User;

/**
 *  用户表映射文件
 */
public interface UserMapper {
    //添加用户信息
    int insertTbUser(User user);
}

