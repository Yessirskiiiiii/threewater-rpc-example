package com.threewater.api.entity;

/**
 * @Author: ThreeWater
 * @Date: 2022/09/28/18:16
 * @Description: 结果状态码枚举类
 */
public enum ResultCode {

    SUCCESS(200, "success"),
    BAD_REQUEST(400, "bad request"),
    NOT_FOUND(404, "not found"),
    SYSTEM_ERROR(500, "system error");

    private final int code;
    private final String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
