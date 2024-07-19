package com.hengtiansoft.myblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengtiansoft.myblog.entity.po.Tag;
import com.hengtiansoft.myblog.mapper.TagMapper;
import com.hengtiansoft.myblog.service.TagService;
import org.springframework.stereotype.Service;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/17 20:32
 * @Description:
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
}
