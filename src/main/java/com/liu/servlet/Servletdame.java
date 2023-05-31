package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.mapper.StuMapper;
import com.liu.service.Stuservicelmpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.liu.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/demo1")
public class Servletdame  {
@Autowired
public Stuservicelmpl stuservicelmpl;
    @RequestMapping("/demo1")
    @ResponseBody
  public String selectstu(HttpServletRequest req) throws IOException {
        // TODO 自动生成的方法存根
        //接受数据转json
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        Stu number=JSON.parseObject(number1,Stu.class);
        //int转string转类型
        String number2= number.getNumber();
        String number3= String.valueOf(number2);
        //输出看看
        System.out.println(number3);
        List<Stu> params = new ArrayList<Stu>();
            params = stuservicelmpl.selectone(number3);
            String stu=  JSON.toJSONString(params);
            System.out.println(stu);
        System.out.println(params);

return  stu;
    }

}
