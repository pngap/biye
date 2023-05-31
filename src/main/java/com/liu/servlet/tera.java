package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.ter;
import com.liu.service.terlmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/ter")
public class tera {
    @Autowired
  public   terlmpl terlmpl;
    @RequestMapping("/terALL")
    @ResponseBody
    @CrossOrigin
    public String terall(HttpServletResponse resp) throws Exception {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
//        Stuservicelmpl stuservicelmpl=applicationContext.getBean(Stuservicelmpl.class);
        List<ter> params = new ArrayList<ter>();
        params=terlmpl.selectAll();
        resp.setContentType("text/text;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        String ter=  JSON.toJSONString(params);
//        String stu = params.toString();
//        PrintWriter writer=resp.getWriter();
//        writer.println(stu);
        System.out.println("mags"+params);
        System.out.println("mag"+ter);
        //      return params;

        return ter;
    }
    @RequestMapping("/terselectone")
    @ResponseBody
    @CrossOrigin
    public String terselectone(HttpServletResponse resp, HttpServletRequest req) throws Exception{
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        ter number=JSON.parseObject(number1,ter.class);
        String number2= number.getNumber();
        String number3= String.valueOf(number2);
        System.out.println(number3);
        List<ter> params = new ArrayList<ter>();

            params = terlmpl.selectone(number3);
            String stu=  JSON.toJSONString(params);

            System.out.println(stu);
        System.out.println(params);
return  stu;

    }
    @RequestMapping("/insertter1")
    @ResponseBody
    @CrossOrigin
    public boolean insertter1(HttpServletResponse resp, HttpServletRequest req) throws Exception{
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        ter stu= JSON.parseObject(number1, ter.class);

        System.out.println(number1);
        System.out.println(stu);
        boolean a=terlmpl.insertter1(stu);
        System.out.println(a);
        return a;
    }
    @RequestMapping("/updateterpwd")
    @ResponseBody
    @CrossOrigin
    public boolean updateterpwd(HttpServletResponse resp, HttpServletRequest req) throws Exception{
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        ter stu= JSON.parseObject(number1, ter.class);
        System.out.println(number1);
        System.out.println(stu);
        String number=stu.getNumber();
        String pwd= String.valueOf(stu.getPwd());
        boolean a=terlmpl.updateterpwd(number,pwd);
        System.out.println(a);
        return a;
    }
    }

