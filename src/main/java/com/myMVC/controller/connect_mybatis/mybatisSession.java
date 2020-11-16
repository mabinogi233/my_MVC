package com.myMVC.controller.connect_mybatis;

import java.io.IOException;

import com.myMVC.controller.frameException.ExceptionCode;
import com.myMVC.controller.frameException.MVCException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//sql session会话
public class mybatisSession {
    static SqlSessionFactory sqlSessionFactory = null;
    static{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        try {
            sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis/config.xml"));
        } catch (IOException e) {
            try {
                //找不到mybatis配置文件
                throw new MVCException(ExceptionCode.MybaitisConfigNotFind);
            } catch (MVCException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

}
