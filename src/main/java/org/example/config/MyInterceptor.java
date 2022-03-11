package org.example.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("========拦截器=========");
        HttpSession session = request.getSession();

        //在登录页面放行
        if (request.getRequestURI().contains("loginPage")) {
            return true;
        }
        //提交登录放行
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        //登陆成功后放行
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        //判断没有登录不放行
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
