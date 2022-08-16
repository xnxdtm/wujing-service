package com.wujing.service.controller;


import com.wujing.service.entity.Annotate;
import com.wujing.service.entity.MindMap;
import com.wujing.service.result.ResultWrapper;
import com.wujing.service.service.AnnotateService;
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
@RequestMapping("/annotate")
public class AnnotateController {
    @Autowired
    AnnotateService annotateService;

    @PostMapping("/save")
    public ResultWrapper<Object> save(@RequestBody Annotate annotate) {
        boolean b = annotateService.save(annotate);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @PostMapping("/insertOrUpdate")
    public ResultWrapper<Object> insertOrUpdate(@RequestBody Annotate annotate) {
        boolean b = annotateService.insertOrUpdate(annotate);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @PostMapping("/update")
    public ResultWrapper<Object> update(@RequestBody Annotate annotate) {
        boolean b = annotateService.updateById(annotate);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }

    @GetMapping("/get")
    public ResultWrapper<Object> get(int id) {
        Annotate byId = annotateService.getById(id);
        return ResultWrapper.getSuccessBuilder().data(byId).build();
    }

    @GetMapping("/getByNodeId")
    public ResultWrapper<Object> getByNodeId(String id) {
        Annotate byId = annotateService.getByNodeId(id);
        return ResultWrapper.getSuccessBuilder().data(byId).build();
    }

    @PostMapping("/delete")
    public ResultWrapper<Object> delete(int id) {
        boolean b = annotateService.removeById(id);
        return ResultWrapper.getSuccessBuilder().data(b).build();
    }
}

