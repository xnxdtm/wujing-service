package com.wujing.service.service.impl;

import com.wujing.service.entity.Category;
import com.wujing.service.mapper.CategoryMapper;
import com.wujing.service.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> getAll() {
        return categoryMapper.selectList(null);
    }
}
