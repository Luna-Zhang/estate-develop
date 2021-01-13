package com.estate.develop.common.enums;

/**
 * @Describe：
 * @Author：luna
 * @Date：2021/1/13:21:28
 */
public enum ResponseMsgEnum {
    SUCCESS("200","成功"),
    SERVER_ERROR("5000", "服务器异常请联系管理员！"),
    PARAM_IS_NOT_EMPTY("1000", "参数不能为空");




    private String code;
    private String msg;
    ResponseMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
