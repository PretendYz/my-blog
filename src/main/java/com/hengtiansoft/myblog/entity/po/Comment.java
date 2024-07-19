package com.hengtiansoft.myblog.entity.po;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {
    private Long id;

    private Long blogId;

    private String commentator;

    private String email;

    private String websiteUrl;

    private String commentBody;

    private Date commentCreateTime;

    private String commentatorIp;

    private String replyBody;

    private Date replyCreateTime;

    private Byte commentStatus;

    private Byte isDeleted;
}