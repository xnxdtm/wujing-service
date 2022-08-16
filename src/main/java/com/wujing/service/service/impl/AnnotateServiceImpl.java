package com.wujing.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wujing.service.entity.Annotate;
import com.wujing.service.entity.MindMap;
import com.wujing.service.mapper.AnnotateMapper;
import com.wujing.service.mapper.MindMapMapper;
import com.wujing.service.service.AnnotateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
@Service
public class AnnotateServiceImpl extends ServiceImpl<AnnotateMapper, Annotate> implements AnnotateService {
    @Autowired
    AnnotateMapper annotateMapper;

    @Override
    public Annotate getByNodeId(String id) {
        LambdaQueryWrapper<Annotate> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Annotate::getNodeId, id);
        return annotateMapper.selectOne(wrapper);
    }

    @Override
    public boolean insertOrUpdate(Annotate annotate) {
        LambdaQueryWrapper<Annotate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Annotate::getNodeId, annotate.getNodeId());
        Annotate dbAnnotate = annotateMapper.selectOne(queryWrapper);
        if (dbAnnotate == null) {
            int insert = annotateMapper.insert(annotate);
            return insert > 0;
        } else {
            int i = annotateMapper.updateById(annotate);
            return i > 0;
        }
    }

}
