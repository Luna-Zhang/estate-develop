package com.estate.develop.common.enums;

/**
 * @Describe：状态枚举
 * @Author：luna
 * @Date：2021/1/13:21:17
 */
public enum StatusEnum {

    ENABLE(1),
    DISABLE(2);

    private Integer status;
    StatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
