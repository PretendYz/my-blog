package com.hengtiansoft.myblog.entity.po;

import java.util.Date;

import lombok.Data;

@Data
public class Category {
    private Long id;

    private String name;

    private String icon;

    private Integer rank;

    private Byte isDeleted;

    private Date createTime;
}