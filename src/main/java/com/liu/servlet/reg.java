package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.service.reglmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@Controller
public class reg {
    @Autowired
    public reglmpl  reglmpl;
    @RequestMapping("/reg1")
    @ResponseBody
    public boolean insertstu(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
           Stu stu= JSON.parseObject(number1, Stu.class);
        System.out.println(number1);
        System.out.println(stu);
           boolean a=reglmpl.insert(stu);
        System.out.println(a);
        return a;
    }
}
