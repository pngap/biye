package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.liu.pojo.stuadnwer;
import com.liu.pojo.testpaper;
import com.liu.pojo.text;
import com.liu.service.perperservicelmpl;
import com.liu.service.stuanwer1;
import com.liu.service.stuanwer1lmpl;
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
@RequestMapping("/insertstuanwer")
@CrossOrigin
public class insertstuanwer2 {
    @Autowired
    public stuanwer1lmpl stuanwer1lmpl;
    @Autowired
    public perperservicelmpl perperservicelmpl;
    @RequestMapping("/insertstuanwera")
    @ResponseBody
    @CrossOrigin
    public  boolean insertstuanwer(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        String number2=number1.replace("]]","]").replace("[[","[");


        JSONObject jsonArray= JSONObject.parseObject(number2);
//
        JSONArray a = jsonArray.getJSONArray("stuanwer");

        System.out.println(a);
        boolean c=true;

        int size = a.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            String jsonObject = String.valueOf(a.getJSONObject(i));
//            String jsonObject = a[i];
            System.out.println("aaa");
            System.out.println(jsonObject);
            stuadnwer tt = JSON.parseObject(jsonObject, stuadnwer.class);

            System.out.println("mgs" + tt);

              c=stuanwer1lmpl.insertstuanwer(tt);

        }
        return c;
    }

    @RequestMapping("/insertstuanwerb")
    @ResponseBody
    @CrossOrigin
    public  boolean insertstuanwerb(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        com.liu.pojo.grade stuadnwer=JSON.parseObject(number1,com.liu.pojo.grade.class);
        System.out.println(number1);
        System.out.println("success");
        System.out.println(stuadnwer);
        String papernumber=stuadnwer.getPaperid();
        List<testpaper> testpaperList=new ArrayList<testpaper>();
        System.out.println(papernumber);
        testpaperList=perperservicelmpl.testpapernumber(papernumber);
        String papernumber1=testpaperList.get(0).getName();
          stuadnwer.setName(papernumber1);
        System.out.println("success");
        System.out.println(stuadnwer);
        boolean c=stuanwer1lmpl.insertgrade(stuadnwer);
        String a= stuadnwer.getPaperid();
        String b=stuadnwer.getNumber();
        String d="完成";
        c=stuanwer1lmpl.updatazhantai(d,a,b);
        return c;
    }
}
