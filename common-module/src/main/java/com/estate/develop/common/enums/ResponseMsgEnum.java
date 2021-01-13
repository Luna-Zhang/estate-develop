package com.estate.develop.common.enums;

/**
 * @Describe：
 * @Author：luna
 * @Date：2021/1/13:21:28
 */
public enum ResponseMsgEnum {
    SUCCESS(200,"成功");




    private int code;
    private String msg;
    ResponseMsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
