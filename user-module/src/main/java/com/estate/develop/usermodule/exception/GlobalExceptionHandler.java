package com.estate.develop.usermodule.exception;

import com.estate.develop.common.enums.ResponseMsgEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Describe：全局异常处理
 * @Author：luna
 * @Date：2021/1/13:21:55
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public HttpResponse<String> exceptionHandler(Exception e) {
        e.printStackTrace();
        if (e instanceof GlobalException) {
            GlobalException ex = (GlobalException) e;
            return HttpResponse.responseMsg(ex.getStatus(), ex.getMsg());
        } else {
            return HttpResponse.responseMsg(ResponseMsgEnum.SERVER_ERROR.getCode(), ResponseMsgEnum.SERVER_ERROR.getMsg());
        }
    }
}
