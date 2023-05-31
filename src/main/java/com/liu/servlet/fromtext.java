package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.liu.pojo.testpaper;
import com.liu.pojo.text;
import com.liu.service.perperservicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@Controller
public class fromtext {

@Autowired
private  perperservicelmpl perperservicelmpl;
    @RequestMapping("/quick1")
    @ResponseBody
    public  String save(HttpServletRequest req) throws IOException {
        System.out.println("success");
//        Map map=req.getParameterMap();
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        String number2=number1.replace("]]","]").replace("[[","[");


        JSONObject jsonArray= JSONObject.parseObject(number2);
//
        JSONArray a = jsonArray.getJSONArray("number");

//        System.out.println(req.getParameterMap());
       testpaper testpaper=new testpaper();

        int size = a.size();
        System.out.println(size);
        for (int i = 0; i < size; i++){
            String jsonObject = String.valueOf(a.getJSONObject(i));
//            String jsonObject = a[i];
           text tt = JSON.parseObject(jsonObject, new TypeReference<text>() {});
            if(i!=0){
               perperservicelmpl.insertall(tt);

                System.out.println("aaa");
            }else {
                testpaper.name= tt.getIdnumber();
                System.out.println(tt.getIdnumber());
                testpaper.number= tt.getIdnumber();
                System.out.println(testpaper.number);
                testpaper.stylea= "未参加";
                perperservicelmpl.insetpaper(testpaper);
                perperservicelmpl.insertall(tt);
            }
//            System.out.println("masge"+jsonObject);
            System.out.println("mgs"+tt);
        }
        System.out.println(a);
//        System.out.println(number2);
//        System.out.println(jsonArray);
//        System.out.println(a);
//        System.out.println(texts);

     return "success";
    }
}
