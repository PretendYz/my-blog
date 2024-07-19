package com.hengtiansoft.myblog.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {

    @TableId
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private Integer locked;
}