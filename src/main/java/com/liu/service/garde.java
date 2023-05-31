package com.liu.service;

import com.liu.pojo.grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface garde {
    public List<grade> grade(String paperid);
    public List<grade> gradefailpaper( String paperid);
    public List<grade> grade1(String number);
    public List<grade> gradefail(String classa);
    public List<grade> gradeclass(String classa);
    public List<grade> gradeall();
    public  boolean updategrade( int number, String paperid,String chengji);
}
