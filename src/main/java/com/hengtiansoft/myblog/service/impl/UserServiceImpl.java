package com.hengtiansoft.myblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengtiansoft.myblog.entity.po.User;
import com.hengtiansoft.myblog.mapper.UserMapper;
import com.hengtiansoft.myblog.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/17 23:33
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        // TODO: 验证密码合法性
        User entity = getUserByUsername(user.getUsername());
        if (Objects.isNull(entity)) {
            user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
            save(user);
        }
    }

    @Override
    public User login(String username, String password) {
        User user = getUserByUsername(username);
        if (!BCrypt.checkpw(password, user.getPassword())) {
            log.error("密码输入错误");
        }
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUsername, username);
        User user = userMapper.selectOne(queryWrapper);
        if (Objects.isNull(user)) {
            log.error("未查询到该用户");
        }
        return user;
    }

}
