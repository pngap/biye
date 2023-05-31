package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.ter;
import com.liu.service.terlmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
@Controller
@RequestMapping("/updata1")
public class updatater {
    @Autowired
    public com.liu.service.terlmpl terlmpl;
    @RequestMapping("/updatater")
    @ResponseBody
    @CrossOrigin
    public  boolean updatater(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        ter stu= JSON.parseObject(number1,ter.class);
        System.out.println(stu);
        System.out.println(terlmpl.updatater1(stu));
        boolean a=terlmpl.updatater1(stu);
        return a;
    }
}
