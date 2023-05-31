package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.ter;
import com.liu.pojo.testpaper;
import com.liu.service.perperservicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/updatapaper")
@CrossOrigin
public class updatepaper {

        @Autowired
        public perperservicelmpl perperservicelmpl;
        @RequestMapping("/updatapaper23")
        @ResponseBody
        @CrossOrigin
        public  boolean updatater(HttpServletRequest req) throws IOException {
            BufferedReader bufferedReader = req.getReader();
            String number1 = bufferedReader.readLine();
            testpaper stu= JSON.parseObject(number1,testpaper.class);

            System.out.println(stu);
            System.out.println(perperservicelmpl.update(stu));
            boolean c=perperservicelmpl.update(stu);
            return c;
        }
    @RequestMapping("/select")
    @ResponseBody
    @CrossOrigin
    public  String select(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader = req.getReader();
        String number1 = bufferedReader.readLine();
        System.out.println(number1);
        testpaper stu= JSON.parseObject(number1,testpaper.class);
        System.out.println(stu.getNumber());
        System.out.println(stu);
        System.out.println(perperservicelmpl.testpapernumber(stu.getNumber()));
        List<testpaper> params=new ArrayList<testpaper>();
        params=perperservicelmpl.testpapernumber(stu.getNumber());
        String testapper=JSON.toJSONString(params);
        return testapper;
    }
}
