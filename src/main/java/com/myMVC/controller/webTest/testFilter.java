package com.myMVC.controller.webTest;

import com.myMVC.controller.annotate.filter.AfterFilter;
import com.myMVC.controller.annotate.filter.BeforeFilter;
import com.myMVC.controller.annotate.filter.Filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * 过滤器测试
 */
@Filter("/run")
public class testFilter {
    @BeforeFilter
    public void before(ServletRequest request, ServletResponse response){
        System.out.println("过滤开始");
    }
    @AfterFilter
    public void after(ServletRequest request, ServletResponse response){
        System.out.println("过滤结束");
    }

}
