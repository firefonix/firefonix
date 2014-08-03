package com.firefonix.core.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by IceFonix on 2014/8/3.
 * 最上层的Servlet
 * 解析HttpRequest协议
 * 提供分发，对比，封装
 * */
public class GoServlet extends WebServlet {
    /**
     * 调用父级的初始化方法
     * */
    protected void initServlet(){

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        initServlet();
    }


}
