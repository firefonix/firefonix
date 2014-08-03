package com.firefonix.core;

import com.firefonix.ctrl.CtrlManager;
import com.firefonix.interceptor.InterceptorManger;
import com.firefonix.router.Router;
import com.firefonix.router.RouterManager;

/**
 * Created by IceFonix on 2014/8/3.
 */

public class FireContext {
    protected FireContext(){}

    RouterManager routerManager ;
    InterceptorManger interceptorManger;
    CtrlManager ctrlManager;

    /**
    * 路由匹配算法
    * */
    public Router findRouter(String routerURL) {
        return null;
    }
}
