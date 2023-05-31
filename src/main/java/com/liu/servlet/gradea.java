package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.grade;
import com.liu.pojo.ter;
import com.liu.service.Stuservicelmpl;
import com.liu.service.gradelmpl;
import com.liu.service.terlmpl;
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
@RequestMapping("/rea25")
public class gradea {
    @Autowired
    public gradelmpl gradelmpl;
    @Autowired
    public terlmpl terlmpl;
    @Autowired
    public Stuservicelmpl stuservicelmpl;
    @RequestMapping("/grade")
    @ResponseBody
    @CrossOrigin
    public String banji(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        Stu stu= JSON.parseObject(number1,Stu.class);
        int index=stu.getIndex();
        List<grade> params=new ArrayList<grade>();
        System.out.println(stu);
        if(index==2){
            String c=stu.getNumber();
            System.out.println(c);
            params=gradelmpl.grade1(c);
        String stu1=  JSON.toJSONString(params);
        return stu1;}
        else if(index==3){
            List<ter> params1=new ArrayList<ter>();
            params1=terlmpl.selectone(stu.getNumber());
            String b=params1.get(0).getBianjibum();
            System.out.println(b);
            params=gradelmpl.gradeclass(b);
            String stu1=  JSON.toJSONString(params);
            return stu1;
        } else if(index==1){
          params=gradelmpl.gradeall();
            String stu1=  JSON.toJSONString(params);
            return stu1;
        }
return  "success";
    }
    @RequestMapping("/gradeselect")
    @ResponseBody
    @CrossOrigin
    public  String gradeselect(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        grade grade=JSON.parseObject(number1, com.liu.pojo.grade.class);
        String a=grade.getPaperid();
        List<grade> params=new ArrayList<grade>();
        params=gradelmpl.grade(a);
        String c=JSON.toJSONString(params);
        return  c;
    }
    @RequestMapping("/gradefial")
    @ResponseBody
    @CrossOrigin
    public String gradefial(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        Stu stu= JSON.parseObject(number1,Stu.class);
        List<grade> params=new ArrayList<grade>();
        System.out.println(stu);
        List<ter> params1=new ArrayList<ter>();
        params1=terlmpl.selectone(stu.getNumber());
        String b=params1.get(0).getBianjibum();
        System.out.println(b);
        params=gradelmpl.gradefail(b);
        String stu1=  JSON.toJSONString(params);
        return stu1;
    }
    @RequestMapping("/gradefialselect")
    @ResponseBody
    @CrossOrigin
    public String gradefialselect(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        grade grade=JSON.parseObject(number1, com.liu.pojo.grade.class);
        String a=grade.getPaperid();
        List<grade> params=new ArrayList<grade>();
        params=gradelmpl.gradefailpaper(a);
        String c=JSON.toJSONString(params);
        return  c;
    }
    @RequestMapping("/updategrade")
    @ResponseBody
    @CrossOrigin
    public boolean updategrade(HttpServletRequest req) throws IOException {
        System.out.println("run");
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        grade grade=JSON.parseObject(number1, com.liu.pojo.grade.class);
        String chengji=grade.getChengji();
        String paoerid=grade.getPaperid();
        int number= Integer.parseInt(grade.getNumber());
      boolean c=gradelmpl.updategrade(number,paoerid,chengji);
        return  c;
    }
}
