package com.estate.develop.usermodule.service;

import com.estate.develop.usermodule.entity.User;

import java.util.Map;

/**
 * @Describe：用户服务接口
 * @Author：luna
 * @Date：2021/1/5:15:21
 */
public interface IUserService {
    /**
     * 登录
     * @param user
     * @return
     */
    Map<String, Object> login(User user);
}
