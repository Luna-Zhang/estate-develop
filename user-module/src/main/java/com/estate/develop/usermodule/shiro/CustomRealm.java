package com.estate.develop.usermodule.shiro;

import com.estate.develop.usermodule.controller.UserBasicController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Describe：
 * @Author：luna
 * @Date：2021/1/6:16:07
 */
public class CustomRealm extends AuthorizingRealm {
    private static Logger log = LogManager.getLogger(CustomRealm.class);

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 添加权限角色
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 认证
        Object principal = authenticationToken.getPrincipal();
        Object credentials = authenticationToken.getCredentials();
        log.info("用户信息：[{}][{}]", principal, credentials);

        return null;
    }
}
