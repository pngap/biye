package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.liu.pojo.Stu;
import com.liu.pojo.admin;
import com.liu.pojo.ter;
import com.liu.pojo.text;
import com.liu.service.loginlmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class login {
    @Autowired
    public loginlmpl loginlmpl;
    @RequestMapping("/quick2")
    @ResponseBody
    public  String login(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();

        admin admin = JSON.parseObject(number1, new TypeReference<admin>() {});

        String ad=admin.getAdmin();

        int adrio=admin.getRadion();
        int pwd=admin.getPwd();
        if(adrio==9){
            List<String> person=new ArrayList<>();
            List<admin> a= loginlmpl.loginadmin(ad,pwd);

            if (a!=null && a.size() > 0){
            admin b=a.get(0);
            System.out.println(pwd);
            System.out.println(b.getPwd());
            System.out.println(a);



            person.add("successadmin");
            person.add(b.getName());

            String stu=  JSON.toJSONString(person);
        return stu;
        }else {
            person.add("fail");
            String stu=  JSON.toJSONString(person);
            return stu;
        }
        }
        else  if(adrio==6)
        {   List<String> person=new ArrayList<>();
            List<Stu> a= loginlmpl.loginstu(ad,pwd);
            if (a!=null &&a.size() > 0){
            Stu b=a.get(0);
            System.out.println(pwd);
            System.out.println(b.getPwd());
            System.out.println(a);

                person.add("successstu");
                person.add(b.getNumber());
                person.add(b.getBanji());
                System.out.println(b.getBanji());
                String stu=  JSON.toJSONString(person);
                return stu;
            }else {
                person.add("fail");
                String stu=  JSON.toJSONString(person);
                System.out.println("aa");
                return stu;
            }
        }else if(adrio==3)
        { List<String> person=new ArrayList<>();
            List<ter> a= loginlmpl.loginter(ad,pwd);

            if(a!=null && a.size() > 0){
            ter b=a.get(0);
            System.out.println(pwd);
            System.out.println(b.getPwd());
            System.out.println(a);


               person.add("successter");
                person.add(b.getNumber());
               String stu=  JSON.toJSONString(person);
               return stu;
           }else {
               person.add("fail");
               String stu=  JSON.toJSONString(person);
               return stu;
           }

        }
        return "fail";
    }
}
