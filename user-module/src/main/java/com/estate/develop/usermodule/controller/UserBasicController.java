package com.estate.develop.usermodule.controller;

import com.estate.develop.usermodule.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String login (User user) {
        log.info("======> 用户登录开始 <=======");
        log.info("用户登录请求参数为：[{}][{}]", user.getPhone());
        log.info("======> 用户登录结束 <=======");
        return "success";
    }

}
