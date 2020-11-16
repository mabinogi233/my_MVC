package com.myMVC.controller.webTest;


import com.myMVC.controller.annotate.bean.Bean;
import com.myMVC.controller.proxy.mainProxy;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Bean
public class proxyTest extends mainProxy {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始proxy");
        Object obj = methodProxy.invokeSuper(o,objects);
        System.out.println("结束proxy");
        return obj;
    }
}
