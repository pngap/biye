package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.ter;
import com.liu.service.Stuservicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@RequestMapping("/StuALL")
@Controller
public class studemo {
    @Autowired
    protected Stuservicelmpl stuservicelmpl;
    @RequestMapping("/StuALL")
    @ResponseBody
    @CrossOrigin
    public String stuall(HttpServletResponse resp) throws Exception {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
//        Stuservicelmpl stuservicelmpl=applicationContext.getBean(Stuservicelmpl.class);
        List<Stu> params = new ArrayList<Stu>();
        params=stuservicelmpl.selectAll();
        resp.setContentType("text/text;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        String stu=  JSON.toJSONString(params);
//        String stu = params.toString();
//        PrintWriter writer=resp.getWriter();
//        writer.println(stu);
        System.out.println("mags"+params);
        System.out.println("mag"+stu);
        //      return params;

        return stu;
    }
    @RequestMapping("/name")
    @ResponseBody
    @CrossOrigin
    public String name(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        Stu number=JSON.parseObject(number1,Stu.class);
        String number2= number.getNumber();
        System.out.println(number2);
        System.out.println(number);
        List<Stu> params = new ArrayList<Stu>();

        params = stuservicelmpl.name(number2);
        String stu=  JSON.toJSONString(params);

        return  stu;
    }
    @RequestMapping("/updatestupwd")
    @ResponseBody
    @CrossOrigin
    public boolean updatestupwd(HttpServletResponse resp, HttpServletRequest req) throws Exception{
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        Stu stu= JSON.parseObject(number1, Stu.class);
        System.out.println(number1);
        System.out.println(stu);
        String number=stu.getNumber();
        String pwd= String.valueOf(stu.getPwd());
        boolean a=stuservicelmpl.updatestupwd(number,pwd);
        System.out.println(a);
        return a;
    }
}
