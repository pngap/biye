package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.homeall;
import com.liu.service.homelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
@CrossOrigin
public class home {
    @Autowired
    public homelmpl homelmpl;
    @RequestMapping("/homeall")
    @ResponseBody
    @CrossOrigin
    public String homeall(){
        //学生人数
          double a=homelmpl.stuhome();
          //班级人数
          double b=homelmpl.banjihome();
          //成绩总数
          double c=homelmpl.gradepasshome();
        //未通过成绩总数
          double d=homelmpl.gradefailhome();
        homeall homeall= new homeall();
        homeall.setStuall(a);
        homeall.setBanjiall(b);
        int pass= (int) (d/c*100);
        int passa= (int) pass;
        System.out.println(pass);
        int fail= (int) (c-d);
        int failpass= (int) ((fail/c)*100);
        int avg= (int) (a/b);
        if(avg<1){
            avg=1;
        }
        homeall.setAvg(avg);
        homeall.setFail(fail);
        homeall.setGradefail(failpass);
        homeall.setGradepass(pass);
        String params= JSON.toJSONString(homeall);
        return  params;
    }
}
