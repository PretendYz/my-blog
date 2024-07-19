package com.hengtiansoft.myblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengtiansoft.myblog.entity.po.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}