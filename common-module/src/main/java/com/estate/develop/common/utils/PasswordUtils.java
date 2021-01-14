package com.estate.develop.common.utils;

import org.apache.shiro.crypto.hash.Sha256Hash;

import java.util.UUID;

/**
 * @Describe：密码加密
 * @Author：luna
 * @Date：2021/1/13:21:28
 */
public class PasswordUtils {

    /**
     * 匹配密码
     *
     * @param password
     * @param salt
     * @param encryptPassword
     * @return
     */
    public static boolean match(String password, String salt, String encryptPassword) {
        if (password != null && encrypt(password, salt).equals(encryptPassword)) {
            return true;
        }
        return false;
    }

    /**
     * 明文密码加密
     *
     * @param password
     * @param salt
     * @return
     */
    public static String encrypt(String password, String salt) {
        return new Sha256Hash(password, salt).toHex();
    }

    /**
     * 获取加密盐
     *
     * @return
     */
    public static String getSalt() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 20);
    }
}
