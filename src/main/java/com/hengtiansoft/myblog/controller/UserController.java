package com.hengtiansoft.myblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hengtiansoft.myblog.common.Response;
import com.hengtiansoft.myblog.entity.po.User;
import com.hengtiansoft.myblog.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


/**
 * @Author: Logan
 * @CreateTime: 2024/7/17 22:52
 * @Description:
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("用户注册")
    @PostMapping(value = "/register")
    public Response register(@RequestBody User user) {
        userService.register(user);
        return Response.success("用户注册成功");
    }

    @ApiOperation("获取用户")
    @GetMapping
    public Response getUserList(@RequestParam(defaultValue = "1") Integer current,
                                @RequestParam(defaultValue = "10") Integer size) {
        Page<User> page = userService.page(new Page<>(current, size));
        return Response.success(page);
    }

    @ApiOperation("查询某一用户")
    @GetMapping("/{id}")
    public Response getUser(@PathVariable Long id) {
        return Response.success(userService.getById(id));
    }
}
