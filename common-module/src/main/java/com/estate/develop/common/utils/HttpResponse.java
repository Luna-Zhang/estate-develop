package com.estate.develop.common.utils;

import com.estate.develop.common.enums.ResponseMsgEnum;

/**
 * @Describe：响应前端
 * @Author：luna
 * @Date：2021/1/13:21:34
 */
public class HttpResponse<T extends Object> {
    private Integer code;
    private String msg;
    private T data;

    public static HttpResponse responseMsg(Integer code, String msg) {
        HttpResponse r = new HttpResponse();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static HttpResponse responseMsg(ResponseMsgEnum responseMsgEnum) {
        HttpResponse r = new HttpResponse();
        r.setCode(responseMsgEnum.getCode());
        r.setMsg(responseMsgEnum.getMsg());
        return r;
    }

    public static HttpResponse responseMsg(Object data) {
        HttpResponse r = new HttpResponse();
        r.setCode(ResponseMsgEnum.SUCCESS.getCode());
        r.setMsg(ResponseMsgEnum.SUCCESS.getMsg());
        r.setData(data);

        return r;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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
