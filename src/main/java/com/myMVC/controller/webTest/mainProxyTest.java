package com.myMVC.controller.webTest;


import com.myMVC.controller.annotate.bean.Bean;
import com.myMVC.controller.annotate.proxy.UseProxy;
import com.myMVC.controller.beanFactory.bean.add_beans;
import com.myMVC.controller.beanFactory.bean.beanFactory;
import com.myMVC.controller.frameException.MVCException;

/**
 * 动态代理测试
 */

@Bean
@UseProxy("proxyTest")
public class mainProxyTest {
    public void printx(){
        System.out.println("_____________");
    }
}
