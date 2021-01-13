package com.estate.develop.usermodule.controller;

import com.estate.develop.common.enums.ResponseMsgEnum;
import com.estate.develop.common.utils.HttpResponse;
import com.estate.develop.usermodule.entity.User;
import com.estate.develop.usermodule.exception.GlobalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe：用户操作类
 * @Author：luna
 * @Date：2020/12/25:21:10
 */
@RestController
@RequestMapping(value = "user")
public class UserBasicController {

    private static Logger log = LogManager.getLogger(UserBasicController.class);

    @PostMapping(value = "/login")
    public HttpResponse login (@RequestBody  User user) {
        log.info("用户登录请求参数为：[{}][{}]", user.getPhone());
        if (user.getPhone() == null) {
            throw new GlobalException(ResponseMsgEnum.PARAM_IS_NOT_EMPTY);
        }
        return HttpResponse.responseMsg("success");
    }

}
