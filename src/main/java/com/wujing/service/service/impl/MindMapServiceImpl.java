package com.wujing.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wujing.service.entity.MindMap;
import com.wujing.service.mapper.MindMapMapper;
import com.wujing.service.service.MindMapService;
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
public class MindMapServiceImpl extends ServiceImpl<MindMapMapper, MindMap> implements MindMapService {

    @Autowired
    MindMapMapper mindMapMapper;

    @Override
    public MindMap getByCategoryId(int id) {
        LambdaQueryWrapper<MindMap> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(MindMap::getCategoryId, id);
        return mindMapMapper.selectOne(wrapper);
    }
}
