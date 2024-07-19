package com.hengtiansoft.myblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hengtiansoft.myblog.entity.po.User;

public interface UserService extends IService<User> {
    void register(User user);

    User login(String username, String password);

    User getUserByUsername(String username);
}
