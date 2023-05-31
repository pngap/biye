package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.admin;
import com.liu.service.loginlmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@Controller
@RequestMapping("/rea")
public class rea {
    @Autowired
    public loginlmpl loginlmpl;

    @RequestMapping("/rea1")
    @ResponseBody
    public boolean updataadmin(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        admin admin= JSON.parseObject(number1, admin.class);
        String ad=admin.getAdmin();
        int pwd=admin.getPwd();
        boolean a=loginlmpl.updateadmin(ad,pwd);
        return a;
    }

    @RequestMapping("/rea2")
    @ResponseBody
    public boolean updatastu(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        admin admin= JSON.parseObject(number1, admin.class);
        String ad=admin.getAdmin();
        int pwd=admin.getPwd();
        boolean a=loginlmpl.updatestu(ad,pwd);
        return a;
    }

    @RequestMapping("/rea3")
    @ResponseBody
    public boolean updatater(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        admin admin= JSON.parseObject(number1, admin.class);
        String ad=admin.getAdmin();
        int pwd=admin.getPwd();
        boolean a=loginlmpl.updateter(ad,pwd);
        return a;

    }
}
