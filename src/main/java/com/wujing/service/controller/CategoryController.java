package com.wujing.service.controller;


import com.wujing.service.entity.Category;
import com.wujing.service.result.ResultWrapper;
import com.wujing.service.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/save")
    public ResultWrapper<Object> save(@RequestBody Category category) {
        boolean b = categoryService.save(category);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @PostMapping("/update")
    public ResultWrapper<Object> update(@RequestBody Category category) {
        boolean b = categoryService.updateById(category);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @GetMapping("/get")
    public ResultWrapper<Object> get(int id) {
        Category byId = categoryService.getById(id);
        return ResultWrapper.getSuccessBuilder().data(byId).build();
    }


    @GetMapping("/getAll")
    public ResultWrapper<Object> getAll() {
        List<Category> all = categoryService.getAll();
        return ResultWrapper.getSuccessBuilder().data(all).build();
    }

    @PostMapping("/delete")
    public ResultWrapper<Object> delete(int id) {
        boolean b = categoryService.removeById(id);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }
}
