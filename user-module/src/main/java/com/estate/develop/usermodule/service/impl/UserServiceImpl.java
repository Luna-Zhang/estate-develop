package com.estate.develop.usermodule.service.impl;


import com.estate.develop.common.constants.CommonConstants;
import com.estate.develop.common.enums.ResponseMsgEnum;
import com.estate.develop.common.enums.StatusEnum;
import com.estate.develop.common.utils.PasswordUtils;
import com.estate.develop.usermodule.dao.UserMapper;
import com.estate.develop.usermodule.entity.User;
import com.estate.develop.usermodule.exception.GlobalException;
import com.estate.develop.usermodule.service.IUserService;
import com.google.common.collect.Maps;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Describe：用户服务实现类
 * @Author：luna
 * @Date：2021/1/5:15:22
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> login(User user) {
        String phone = user.getPhone();
        // 获取用户信息
        User userInfo = userMapper.findInfoByPhone(phone);
        if (null == userInfo) {
            throw new GlobalException(ResponseMsgEnum.USER_NON_EXISTENT);
        }
        // 校验状态是否开启
        if (userInfo.getEnable() == StatusEnum.DISABLE.getStatus()) {
            throw new GlobalException(ResponseMsgEnum.USER_STATUS_DISABLE);
        }
        // 校验密码
        String password = user.getPassword();
        String encryptedPassword = PasswordUtils.encrypt(password, CommonConstants.SALT);
        if (encryptedPassword != user.getPassword()) {
            throw new GlobalException(ResponseMsgEnum.PASSWORD_FAULT);
        }
        UsernamePasswordToken token = new UsernamePasswordToken(phone, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ResponseMsgEnum.LOGIN_FAIL);
        }
        Map<String, Object> returnParamMap = Maps.newHashMap();
        returnParamMap.put(CommonConstants.TOKEN, subject.getSession().getId());
        returnParamMap.put(CommonConstants.USER_ID, userInfo.getId());
        return returnParamMap;
    }
}
