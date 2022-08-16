package com.wujing.service.result;

import com.wujing.service.enums.StateCodeEnum;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wujing
 * @version V1.0
 * @Description
 */
@Data
@Builder
public class ResultWrapper<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public static <T> ResultWrapper.ResultWrapperBuilder<T> getSuccessBuilder() {
        return ResultWrapper.<T>builder().code(StateCodeEnum.SUCCESS.getCode())
                .msg(StateCodeEnum.SUCCESS.getMsg());
    }

    public static <T> ResultWrapper.ResultWrapperBuilder<T> getFailBuilder() {
        return ResultWrapper.<T>builder().code(StateCodeEnum.FAIL.getCode())
                .msg(StateCodeEnum.FAIL.getMsg());
    }
}