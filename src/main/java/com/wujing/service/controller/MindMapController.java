package com.wujing.service.controller;


import com.wujing.service.entity.MindMap;
import com.wujing.service.result.ResultWrapper;
import com.wujing.service.service.MindMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
@RestController
@RequestMapping("/mind-map")
public class MindMapController {
    @Autowired
    MindMapService mindMapService;

    @PostMapping("/save")
    public ResultWrapper<Object> save(@RequestBody MindMap mindMap) {
        boolean b = mindMapService.save(mindMap);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @PostMapping("/update")
    public ResultWrapper<Object> update(@RequestBody MindMap mindMap) {
        boolean b = mindMapService.updateById(mindMap);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @GetMapping("/get")
    public ResultWrapper<Object> get(int id) {
        MindMap byId = mindMapService.getById(id);
        return ResultWrapper.getSuccessBuilder().data(byId).build();
    }

    @GetMapping("/getByCategoryId")
    public ResultWrapper<Object> getByCategoryId(int id) {
        MindMap byId = mindMapService.getByCategoryId(id);
        return ResultWrapper.getSuccessBuilder().data(byId).build();
    }

    @PostMapping("/delete")
    public ResultWrapper<Object> delete(int id) {
        boolean b = mindMapService.removeById(id);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }
}

