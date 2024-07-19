package com.hengtiansoft.myblog.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class Config {
    private Long id;

    private String name;

    private String value;

    private Date createTime;

    private Date updateTime;
}