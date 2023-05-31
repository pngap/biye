package com.liu.servlet;

import com.alibaba.fastjson.JSON;
import com.liu.pojo.paperquestiont;
import com.liu.pojo.pigaixxa;
import com.liu.pojo.stuadnwer;
import com.liu.pojo.testpaper;
import com.liu.service.paperquestionlmpl;
import com.liu.service.perperservicelmpl;
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
@RequestMapping("/paperquestion")
@CrossOrigin
public class paperquestion {
    @Autowired
    public paperquestionlmpl paperquestionlmpl;
    @Autowired
    public perperservicelmpl perperservicelmpl;
    @RequestMapping("/paperquestiona")
    @ResponseBody
    @CrossOrigin
    public String all(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        paperquestiont paperquestiont=JSON.parseObject(number1,paperquestiont.class);
        String paperquestionq=paperquestiont.getPapernumber();
        List<paperquestiont> params= new ArrayList<paperquestiont>();
         params=paperquestionlmpl.all(paperquestionq);
        String paper=JSON.toJSONString(params);
        return  paper;
    }
    @RequestMapping("/pigaixx")
    @ResponseBody
    @CrossOrigin
    public String pigaixx(HttpServletRequest req) throws IOException {
        BufferedReader bufferedReader=req.getReader();
        String number1=bufferedReader.readLine();
        stuadnwer paperquestiont=JSON.parseObject(number1,stuadnwer.class);
        String paperid=paperquestiont.getPaperid();
        int stuid=paperquestiont.getStuid();
        List<pigaixxa> params= new ArrayList<pigaixxa>();
        params=perperservicelmpl.pigaixx(stuid,paperid);
        String paper=JSON.toJSONString(params);
        System.out.println("aa"+paper);
        System.out.println("ab"+params.size());
        if (params.size()==0){
            return  "fail";
        }else{
        return  paper;}
    }
}
