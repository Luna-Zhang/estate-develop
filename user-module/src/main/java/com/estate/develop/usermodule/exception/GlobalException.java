package com.estate.develop.usermodule.exception;

import com.estate.develop.common.enums.ResponseMsgEnum;

/**
 * @Describe：定义异常
 * @Author：luna
 * @Date：2021/1/13:21:54
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = -4360697053741783590L;
    private String status;
    private String msg;

    public GlobalException(ResponseMsgEnum responseMsgEnum) {
        super(responseMsgEnum.getMsg());
        this.status = responseMsgEnum.getCode();
        this.msg = responseMsgEnum.getMsg();
    }

    public GlobalException(String status) {
        super(status);
        this.status = status;
    }

    public GlobalException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public GlobalException(String status, String msg) {
        super(msg);
        this.msg = msg;
        this.status = status;
    }

    public GlobalException(String status, String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
