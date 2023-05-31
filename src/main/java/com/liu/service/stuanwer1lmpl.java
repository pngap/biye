package com.liu.service;

import com.liu.mapper.stuanwerMapper;
import com.liu.pojo.grade;
import com.liu.pojo.pigai;
import com.liu.pojo.stuadnwer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class stuanwer1lmpl {
    @Autowired
    public stuanwerMapper stuanwerMapper;
    public boolean insertstuanwer(stuadnwer stuadnwer){
        return  stuanwerMapper.insertstuanwer(stuadnwer);
    }
    public boolean  insertgrade(grade grade){

        return  stuanwerMapper.insertgrade(grade);
    }
    public  boolean updatazhantai(String zhuantai, String paperid,  String stuid){
        return  stuanwerMapper.updatazhantai(zhuantai,paperid,stuid);
    }
}
