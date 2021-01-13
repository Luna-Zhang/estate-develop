package com.estate.develop.usermodule.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Describe：用户服务过滤器
 * @Author：luna
 * @Date：2021/1/6:15:19
 */

public class UserServerFilter {


    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=====init ====");
    }


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("===doFilter===");
        filterChain.doFilter(servletRequest, servletResponse);
    }


    public void destroy() {
        System.out.println("====destroy====");
    }
}
