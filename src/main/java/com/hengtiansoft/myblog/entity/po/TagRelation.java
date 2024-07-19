package com.hengtiansoft.myblog.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class TagRelation {
    private Long id;

    private Long blogId;

    private Long tagId;

    private Date createTime;
}