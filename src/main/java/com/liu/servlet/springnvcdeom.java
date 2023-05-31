package com.liu.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springnvcdeom {
@RequestMapping("/quick")
    public  String save(){
        System.out.println("running");
        return "index";
    }
}
