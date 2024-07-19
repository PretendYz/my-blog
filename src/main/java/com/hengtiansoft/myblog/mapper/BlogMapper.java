package com.hengtiansoft.myblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengtiansoft.myblog.entity.po.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper extends BaseMapper<Blog> {
}