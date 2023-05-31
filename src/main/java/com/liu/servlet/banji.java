package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.classroom;
import com.liu.pojo.ter;
import com.liu.service.banjilmpl;
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
@RequestMapping("/rea23")
@CrossOrigin
public class banji {
    @Autowired
    public banjilmpl banjilmpl;
    @RequestMapping("/banjistu1")
    @ResponseBody
    @CrossOrigin
    public String banjistu(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        Stu stu= JSON.parseObject(number1,Stu.class);
        System.out.println(stu);
            List<Stu> params = new ArrayList<Stu>();
            params=banjilmpl.banji1(stu.getNumber());
            System.out.println(params);
//            Stu a=params.get(0);
            String  banji=  params.get(0).getBanji();
            String  xueyuan=params.get(0).getXueyan();
            int nianji=params.get(0).getNianji();
            String zhuanye=params.get(0).getZhany();
            System.out.println(banji);
            params=banjilmpl.banji2(banji,xueyuan,nianji,zhuanye);
            String stu1=  JSON.toJSONString(params);
            return stu1;

    }
    @RequestMapping("/banjiter")
    @ResponseBody
    @CrossOrigin
    public String banjiter(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        ter ter= JSON.parseObject(number1,ter.class);
        System.out.println(ter);
        List<ter> params = new ArrayList<ter>();
        List<Stu> params1 = new ArrayList<Stu>();
        params=banjilmpl.banjiter1(ter.getNumber());
        System.out.println(params);
//        String  banji=  params.get(0).getBianjibum();
        String  a=  params.get(0).getBianjibum();
        System.out.println(a);
        params1=banjilmpl.banji3(a);
        String stu1=  JSON.toJSONString(params1);
        return stu1;

    }
    @RequestMapping("/banjiadmin")
    @ResponseBody
    @CrossOrigin
    public String banjiadmin(HttpServletRequest req) throws IOException {
        System.out.println("run");
        List<classroom> params = new ArrayList<classroom>();
            params=banjilmpl.banjiall();
        System.out.println(params);
        String stu1=  JSON.toJSONString(params);
        return stu1;

    }
    @RequestMapping("/banjiinsert")
    @ResponseBody
    @CrossOrigin
    public boolean banjiinsert(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        classroom classroom=JSON.parseObject(number1, com.liu.pojo.classroom.class);
        System.out.println(classroom);
       boolean a=banjilmpl.banjitianji(classroom);
        return a;

    }
    @RequestMapping("/updatabanji")
    @ResponseBody
    @CrossOrigin
    public boolean updatabanji(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        classroom classroom=JSON.parseObject(number1, com.liu.pojo.classroom.class);
        System.out.println(classroom);
        boolean a=banjilmpl.updatabanji(classroom);
        return a;

    }
}
