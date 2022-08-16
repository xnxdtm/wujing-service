package com.wujing.service.service;

import com.wujing.service.entity.Annotate;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wujing.service.entity.MindMap;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wujing
 * @since 2022-08-09
 */
public interface AnnotateService extends IService<Annotate> {

    Annotate getByNodeId(String id);

    boolean insertOrUpdate(Annotate annotate);
}
