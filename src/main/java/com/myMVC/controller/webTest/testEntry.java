package com.myMVC.controller.webTest;

import com.myMVC.controller.annotate.bean.AddBeans;
import com.myMVC.controller.annotate.bean.Bean;
import com.myMVC.controller.annotate.bean.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式bean测试
 */

@Bean
@Prototype
public class testEntry {
    int id;
    String text;
    public testEntry(int id,String text){
        this.id=id;
        this.text=text;
    }
    public void print(){
        System.out.println("this is testEntry");
    }
    @AddBeans
    public static Map<String, Object> add_beans(){
        Map<String,Object> map = new HashMap<String, Object>();
        testEntry test_1 = new testEntry(1,"this is test_1");
        testEntry test_2 = new testEntry(2,"this is test_2");
        map.put("bean_name_1",test_1);
        map.put("bean_name_2",test_2);
        return map;
    }
}
