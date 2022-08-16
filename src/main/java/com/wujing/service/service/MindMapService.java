package com.wujing.service.service;

import com.wujing.service.entity.MindMap;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
@Repository
public interface MindMapService extends IService<MindMap> {

    MindMap getByCategoryId(int id);
}
