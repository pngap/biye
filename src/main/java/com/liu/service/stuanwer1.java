package com.liu.service;

import com.liu.pojo.grade;
import com.liu.pojo.pigai;
import com.liu.pojo.stuadnwer;
import org.apache.ibatis.annotations.Param;

public interface stuanwer1 {
    public boolean insertstuanwer(stuadnwer stuadnwer);
    public boolean  insertgrade(grade grade);
    public  boolean updatazhantai(String zhuantai,  String paperid,  String stuid);
}
