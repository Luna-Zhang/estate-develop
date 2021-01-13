package com.estate.develop.usermodule.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.Map;

/**
 * @Describe：jwt工具类
 * @Author：luna
 * @Date：2021/1/5:15:56
 */
public class JWTUtil {

    private static final String SECRET = "eae7ec87910967d7d55aa37c341af579";

    private static final String ISSUER ="my_boo";

    /**
     * 生成token
     * @param params
     * @return
     */
    public static String createToken (Map<String, String> params) throws Exception {
        try {
            JWTCreator.Builder builder = JWT.create()
                    .withAudience(ISSUER) // 签发对象
                    .withExpiresAt(DateUtils.addDays(new Date(), 1)); // 1天后过期时间
            params.forEach((k,v) -> builder.withClaim(k,v));

            return builder.sign(Algorithm.HMAC256(SECRET));
        } catch (Exception e) {
            throw new Exception("生成token失败，请联系管理员！");
        }
    }


    /**
     * 验证token
     * @param token
     * @return
     */
    public static Map<String, String> verifyToken (String token) throws Exception {
        try {
            JWTVerifier build = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT verify = build.verify(token);

            Map<String, Claim> claims = verify.getClaims();
            Map<String, String> resultMap = Maps.newHashMap();
            claims.forEach((k,v)->resultMap.put(k,v.asString()));

            return resultMap;
        } catch (Exception e) {
            throw new Exception("验证token失败，请联系管理员！");
        }
    }

    /**
     * 验证token是否过期失效
     * @param expirationTime
     * @return
     */
    public static boolean isTokenExpired (Date expirationTime) throws Exception {
        if (null == expirationTime) {
            throw new Exception("过期时间不能为空！");
        }
        return expirationTime.before(new Date());
    }
}