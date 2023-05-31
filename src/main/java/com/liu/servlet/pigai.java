package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.paperquestiont;
import com.liu.pojo.ter;
import com.liu.service.paperquestionlmpl;
import com.liu.service.perperservicelmpl;
import com.liu.service.terlmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pigai1")
@CrossOrigin
public class pigai {
    @Autowired
    public perperservicelmpl perperservicelmpl;
    @RequestMapping("/pigai2")
    @ResponseBody
    @CrossOrigin
    public String pigaiall(HttpServletRequest req) throws Exception {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
//        Stuservicelmpl stuservicelmpl=applicationContext.getBean(Stuservicelmpl.class);

        List<com.liu.pojo.pigai> params = new ArrayList<com.liu.pojo.pigai>();
        params=perperservicelmpl.pigaiall();
        String stu=  JSON.toJSONString(params);
//        String stu = params.toString();
//        PrintWriter writer=resp.getWriter();
//        writer.println(stu);
        System.out.println("mags"+params);
        System.out.println("mag"+stu);
        //      return params;

        return stu;
    }
    @Autowired
    public terlmpl terlmpl;
    @RequestMapping("/pigai3")
    @ResponseBody
    @CrossOrigin
    public String pigaiter(HttpServletRequest req) throws Exception {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
//        Stuservicelmpl stuservicelmpl=applicationContext.getBean(Stuservicelmpl.class);
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        ter ter=JSON.parseObject(number1,com.liu.pojo.ter.class);
        String number=ter.getNumber();
        List<com.liu.pojo.ter> params = new ArrayList<com.liu.pojo.ter>();
        params=terlmpl.selectone(number);
        System.out.println(params);
        List<com.liu.pojo.pigai> params1 = new ArrayList<com.liu.pojo.pigai>();
        params1=perperservicelmpl.pigaiter(params.get(0).getBianjibum());
        String stu=  JSON.toJSONString(params1);
//        String stu = params.toString();
//        PrintWriter writer=resp.getWriter();
//        writer.println(stu);
        System.out.println("mags"+params1);
        System.out.println("mag"+stu);
        //      return params;

        return stu;
    }
}
