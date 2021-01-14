package com.estate.develop.usermodule.controller;

import com.estate.develop.common.enums.ResponseMsgEnum;
import com.estate.develop.common.utils.PhoneUtil;
import com.estate.develop.usermodule.exception.HttpResponse;
import com.estate.develop.usermodule.entity.User;
import com.estate.develop.usermodule.exception.GlobalException;
import com.estate.develop.usermodule.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IUserService userService;



    public HttpResponse register () {

        return null;
    }

    @PostMapping(value = "/login")
    public HttpResponse login (@RequestBody User user) {
        String phone = user.getPhone();
        String password = user.getPassword();
        if (StringUtils.isEmpty(phone)) {
            throw new GlobalException(ResponseMsgEnum.PHONE_IS_NOT_EMPTY);
        }
        if (StringUtils.isEmpty(password)) {
            throw new GlobalException(ResponseMsgEnum.PASSWORD_IS_NOT_EMPTY);
        }
        if (!PhoneUtil.validPhone(phone)) {
            throw new GlobalException(ResponseMsgEnum.PASSWORD_IS_NOT_EMPTY);
        }
        return HttpResponse.responseMsg(userService.login(user));
    }

}
