package com.myMVC.controller.webTest;

import com.myMVC.controller.annotate.handle.Handle;
import com.myMVC.controller.annotate.handle.PostHandle;
import com.myMVC.controller.annotate.handle.PreHandle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 非动态代理拦截器测试
 */

@Handle("/run/test")
public class testHandle {
    @PreHandle
    public void before(HttpServletRequest request, HttpServletResponse response){
        System.out.println("拦截开始");
    }
    @PostHandle
    public void after(HttpServletRequest request, HttpServletResponse response){
        System.out.println("拦截结束");
    }
}
