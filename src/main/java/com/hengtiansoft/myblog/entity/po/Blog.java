package com.hengtiansoft.myblog.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private Long id;

    private String title;

    private String subUrl;

    private String coverImage;

    private Long categoryId;

    private String categoryName;

    private String tags;

    private Byte status;

    private Long views;

    private Byte enableComment;

    private Byte isDeleted;

    private Date createTime;

    private Date updateTime;

    private String content;

}