package com.firefonix.core.servlet;

import com.firefonix.core.FireContext;
import com.firefonix.core.FireContextBuilder;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IceFonix on 2014/8/3.
 * 最上层的Servlet
 * 解析HttpRequest协议
 * 提供分发，对比，封装
 * */
public class GoServlet extends WebServlet {
    //此处摘自Servlet API
    private static final String METHOD_DELETE = "DELETE";
    private static final String METHOD_HEAD = "HEAD";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_OPTIONS = "OPTIONS";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final String METHOD_TRACE = "TRACE";

    private static final String HEADER_IFMODSINCE = "If-Modified-Since";
    private static final String HEADER_LASTMOD = "Last-Modified";


    private FireContext fireContext ;
    /**
     * 调用父级的初始化方法
     * */
    protected void initServlet(){

    }

    /**
     * 匹配路由器
     * 并执行路由器串
     * */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String routerURL = req.getRequestURI();

    }

    /**
     * 判断是否是HttpServlet
     * 如果是，则提供跳转到protected方法
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request;
        HttpServletResponse response;

        if (!(req instanceof HttpServletRequest &&
                res instanceof HttpServletResponse)) {
            throw new ServletException("non-HTTP request or response");
        }

        request = (HttpServletRequest) req;
        response = (HttpServletResponse) res;

        service(request, response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        initServlet();
    }


}
