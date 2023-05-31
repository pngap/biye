package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.grade;
import com.liu.pojo.number;
import com.liu.service.dellmpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/del")
@CrossOrigin
public class del {
    @Autowired
    public dellmpl dellmpl;
    @RequestMapping("/delbanji")
    @ResponseBody
    @CrossOrigin
    public boolean delbanji( HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        System.out.println(number1);
        number  number= JSON.parseObject(number1,com.liu.pojo.number.class);
        String c=number.getNumber();
        System.out.println(c);
        boolean a=dellmpl.delbanji(c);
        return a;
    }
    @RequestMapping("/delstu")
    @ResponseBody
    @CrossOrigin
    public boolean delstu(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        System.out.println(number1);
         number  number= JSON.parseObject(number1,com.liu.pojo.number.class);
          String c=number.getNumber();
        boolean a=dellmpl.delstu(c);

        return  a;
    }
    @RequestMapping("/delter")
    @ResponseBody
    @CrossOrigin
    public boolean delter( HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        System.out.println(number1);
        number  number= JSON.parseObject(number1,com.liu.pojo.number.class);
        String c=number.getNumber();
        boolean a=dellmpl.delter(c);
        return a;
    }
    @RequestMapping("/delpaper")
    @ResponseBody
    @CrossOrigin
    public boolean delpaper(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        System.out.println(number1);
        number  number= JSON.parseObject(number1,com.liu.pojo.number.class);
        String c=number.getNumber();
        boolean a=dellmpl.delpaper(c);
        return  a;
    }
    @RequestMapping("/delmessage")
    @ResponseBody
    @CrossOrigin
    public boolean delmessage( HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        System.out.println(number1);
        number  number= JSON.parseObject(number1,com.liu.pojo.number.class);
        String c=number.getNumber();
        boolean a=dellmpl.delmessage(c);
        return  a;
    }
    @RequestMapping("/delgrade")
    @ResponseBody
    @CrossOrigin
    public boolean delgrade( HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        System.out.println(number1);
        grade  grade=JSON.parseObject(number1, com.liu.pojo.grade.class);
        String number=grade.getNumber();
        String paperid=grade.getPaperid();
        boolean a=dellmpl.delgrade(number,paperid);
        return  a;
    }
}
