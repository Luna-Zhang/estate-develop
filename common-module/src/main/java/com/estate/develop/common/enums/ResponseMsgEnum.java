package com.estate.develop.common.enums;

/**
 * @Describe：错误码、错误信息
 * @Author：luna
 * @Date：2021/1/13:21:28
 */
public enum ResponseMsgEnum {
    SUCCESS("200","成功"),
    SERVER_ERROR("5000", "服务器异常请联系管理员！"),
    PARAM_IS_NOT_EMPTY("1000", "参数不能为空"),
    LOGIN_FAIL("10001","登录失败"),
    USERNAME_IS_NOT_EMPTY("10002","用户名不能为空"),
    PASSWORD_IS_NOT_EMPTY("10003","密码不能为空"),
    PHONE_IS_NOT_EMPTY("10004","手机号不能为空"),
    USER_NON_EXISTENT("10005", "用户不存在"),
    USER_STATUS_DISABLE("10006","当前用户已被禁用,请联系管理员"),
    PASSWORD_FAULT("10007", "密码错误")

    ;




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
