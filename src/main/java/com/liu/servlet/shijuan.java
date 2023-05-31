package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.classroom;
import com.liu.pojo.testpaper;
import com.liu.service.paperlmpl;
import com.liu.service.reglmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class shijuan {
    @Autowired
    public paperlmpl paperlmpl;
    @RequestMapping("/shijuan")
    @ResponseBody
    @CrossOrigin
    public  String all(){
        List<testpaper> params = new ArrayList<testpaper>();
        params=paperlmpl.all();
        System.out.println(params);
        String stu1=  JSON.toJSONString(params);
        return stu1;

    }
}
