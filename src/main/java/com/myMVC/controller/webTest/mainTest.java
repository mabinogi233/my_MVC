package com.myMVC.controller.webTest;


import com.myMVC.controller.MVCutils.packageClassScanner;
import com.myMVC.controller.annotate.bean.Autowired;
import com.myMVC.controller.annotate.bean.BeanScanner;
import com.myMVC.controller.annotate.filter.FilterOperator;
import com.myMVC.controller.annotate.handle.handleOperator;
import com.myMVC.controller.annotate.mvc.ControllerRequestMappingOperator;
import com.myMVC.controller.beanFactory.bean.add_beans;
import com.myMVC.controller.beanFactory.bean.beanFactory;
import com.myMVC.controller.connect_mybatis.dao;
import com.myMVC.controller.connect_mybatis.entryy;
import com.myMVC.controller.frameException.MVCException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
/**
 * 动态代理测试
 */
public class mainTest {
    public static void main(String [] args) throws MVCException, ClassNotFoundException {
        add_beans.init();
        Class.forName("com.myMVC.controller.proxy.mainProxy");
        mainProxyTest m = (mainProxyTest) beanFactory.getBean("mainProxyTest");
        m.printx();
    }
}
