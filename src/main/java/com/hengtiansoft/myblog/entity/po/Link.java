package com.hengtiansoft.myblog.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class Link {
    private Long id;

    private Byte type;

    private String name;

    private String url;

    private String description;

    private Integer rank;

    private Byte isDeleted;

    private Date createTime;
}