package com.liu.service;

import com.liu.mapper.regMapper;
import com.liu.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class reglmpl {
    @Autowired
    public regMapper regMapper;
    public  boolean insert(Stu stu){

        return regMapper.insert(stu);
    }
}
