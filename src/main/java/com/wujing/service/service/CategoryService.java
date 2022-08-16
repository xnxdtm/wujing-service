package com.wujing.service.service;

import com.wujing.service.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
public interface CategoryService extends IService<Category> {

    List<Category> getAll();
}
