package com.hengtiansoft.myblog.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class Tag {
    private Long id;

    private String name;

    private Integer count;

    private Byte isDeleted;

    private Date createTime;
}