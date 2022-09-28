package com.threewater.api.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: ThreeWater
 * @Date: 2022/09/28/18:13
 * @Description: 结果类
 */
@Getter
@Setter
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -1708970514678535317L;

    private Integer code;

    private String message;

    private T data;

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getDesc());
        result.setData(object);
        return result;
    }

    public static <T> Result<T> error(ResultCode resultCode) {
        Result<T> result = new Result<>();
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getDesc());
        return result;
    }

    public static <T> Result<T> error(ResultCode resultCode, String message) {
        Result<T> result = new Result<>();
        result.setCode(resultCode.getCode());
        result.setMessage(message);
        return result;
    }

}
