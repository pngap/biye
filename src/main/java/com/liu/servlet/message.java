package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.message1;
import com.liu.service.messagelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/message1")
@CrossOrigin
public class message {
    @Autowired
    public messagelmpl messagelmpl;
    @RequestMapping("/message")
    @ResponseBody
    @CrossOrigin
    public boolean message(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
            String number1=bufferedReader.readLine();
        message1 stu= JSON.parseObject(number1, message1.class);
        System.out.println(number1);
        System.out.println(stu);
            boolean a=messagelmpl.insertmessage(stu);

        return a;
    }
    @RequestMapping("/message2")
    @ResponseBody
    @CrossOrigin
    public String all() throws IOException {

        List<message1> params=new ArrayList<message1>();
        params=messagelmpl.all();
        System.out.println(params);
        String stu1=  JSON.toJSONString(params);
        System.out.println(stu1);
        return  stu1;
    }
    @RequestMapping("/message3")
    @ResponseBody
    @CrossOrigin
    public String selectone(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        message1 stu= JSON.parseObject(number1, message1.class);
        List<message1> params=new ArrayList<message1>();
        params=messagelmpl.selectone(stu.getNumber());
        System.out.println(params);
        String stu1=  JSON.toJSONString(params);
        System.out.println(stu1);
        return  stu1;
    }
}
