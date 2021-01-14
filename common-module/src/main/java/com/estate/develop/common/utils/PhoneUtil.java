package com.estate.develop.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Describe：手机号合法性工具类
 * @Author：luna
 * @Date：2021/1/14 15:17:53
 */
public class PhoneUtil {

    /**
     * 验证手机号是否合法
     *
     * @param number
     * @return
     */
    public static boolean validPhone(String number) {
        if (number.length() != 11) return false;
        try {
            String exp = "^[1](([3][0-9])|([4][5,7,9])|([5][^4,6,9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$";
            Pattern pattern4 = Pattern.compile(exp);
            Matcher match4 = pattern4.matcher(number);
            return match4.matches();
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

}
