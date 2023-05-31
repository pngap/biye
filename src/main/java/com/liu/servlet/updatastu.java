package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.Stu;
import com.liu.pojo.classroom;
import com.liu.pojo.ter;
import com.liu.service.Stuservicelmpl;
import com.liu.service.banjilmpl;
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
@RequestMapping("/updata2")
public class updatastu {
    @Autowired
    public Stuservicelmpl stuservicelmpl;
    @Autowired
    public banjilmpl banjilmpl;

    @RequestMapping("/updatastu")
    @ResponseBody
    @CrossOrigin
    public  boolean updatastu(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        Stu stu= JSON.parseObject(number1,Stu.class);
        int stuclass= Integer.parseInt(stu.getBanji());
        System.out.println(stuclass);
        List<classroom> banjis=new ArrayList<classroom>();
        banjis=banjilmpl.banjiall();
        System.out.println(banjis);

        boolean a;
        int b=banjis.size();
        for(int i=0;i<b;i++){
            int classroom= Integer.parseInt(banjis.get(i).classroom);
            System.out.println(classroom);
           if (stuclass==classroom){
              a=stuservicelmpl.updatastu1(stu);
               System.out.println(a);
               return a;
           }

        }
        System.out.println("zuihou");
        return false;
    }

}
