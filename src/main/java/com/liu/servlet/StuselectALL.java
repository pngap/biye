package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.liu.pojo.Stu;
import com.liu.service.Stuservicelmpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/StuselectALL")
@CrossOrigin
public class StuselectALL extends HttpServlet {


    @Override
    @CrossOrigin
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO 自动生成的方法存根
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSe源服务器未能找到目标资源的表示或者是不愿公开一个已经存在的资源表示。ssionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        StuMapper mapper = sqlSession.getMapper(StuMapper.class);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Stuservicelmpl stuservicelmpl=applicationContext.getBean(Stuservicelmpl.class);
        List<Stu> params = new ArrayList<Stu>();
//      Stuservicelmpl stuservicelmpl=new Stuservicelmpl();
        try {

//            String stu=  JSON.toJSONString(stuservicelmpl.selectAll());
//                PrintWriter writer=resp.getWriter();
//                writer.println(stu);
//            Stuservicelmpl student = Stuservicelmpl.class.newInstance();
            params=stuservicelmpl.selectAll();
            resp.setContentType("text/text;charset=utf-8");
            resp.setCharacterEncoding("UTF-8");
            String stu=  JSON.toJSONString(params);
            PrintWriter writer=resp.getWriter();
            writer.println(stu);
             System.out.println(stu);
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO 自动生成的方法存根
        super.doPost(req, resp);
    }

}
