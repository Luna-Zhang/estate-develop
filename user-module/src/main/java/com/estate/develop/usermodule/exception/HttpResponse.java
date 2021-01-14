package com.estate.develop.usermodule.exception;

import com.estate.develop.common.enums.ResponseMsgEnum;

/**
 * @Describe：响应前端
 * @Author：luna
 * @Date：2021/1/13:21:34
 */
public class HttpResponse<T extends Object> {
    private String status;
    private String msg;
    private T data;

    public static HttpResponse responseMsg(String code, String msg) {
        HttpResponse r = new HttpResponse();
        r.setStatus(code);
        r.setMsg(msg);
        return r;
    }

    public static HttpResponse responseMsg(ResponseMsgEnum responseMsgEnum) {
        HttpResponse r = new HttpResponse();
        r.setStatus(responseMsgEnum.getCode());
        r.setMsg(responseMsgEnum.getMsg());
        return r;
    }

    public static HttpResponse responseMsg(Object data) {
        HttpResponse r = new HttpResponse();
        r.setStatus(ResponseMsgEnum.SUCCESS.getCode());
        r.setMsg(ResponseMsgEnum.SUCCESS.getMsg());
        r.setData(data);

        return r;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
