package com.myMVC.controller.webTest;

import com.myMVC.controller.HttpMapRequest.Model;
import com.myMVC.controller.annotate.bean.Autowired;
import com.myMVC.controller.annotate.mvc.Controller;
import com.myMVC.controller.annotate.mvc.RequestMapping;
import com.myMVC.controller.connect_mybatis.dao;
import com.myMVC.controller.connect_mybatis.entryy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * mybatis测试
 */

@Controller
@RequestMapping("/run")
public class myTest {
    @Autowired
    dao mydao;
    @RequestMapping("/test")
    public entryy test(Model model) throws IOException {
        String id = model.getParameter("id");
        entryy re = new entryy();
        re.setId(Integer.parseInt(id));
        re.setText("dwefogrihtbujegr");
        mydao.insert(re);
        return mydao.findUserById(Integer.parseInt(id));
    }
}
