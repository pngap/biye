package com.liu.service;

import com.liu.mapper.banjiMapper;
import com.liu.mapper.gradeMapper;
import com.liu.pojo.grade;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class gradelmpl {
    @Autowired
    public gradeMapper gradeMapper;
    public List<grade> grade(String paperid){
        return  gradeMapper.grade(paperid);
    }
    public List<grade> grade1(String number){
        return gradeMapper.grade1(number);
    }
    public List<grade> gradeclass( String classa){

        return gradeMapper.gradeclass(classa);
    }
    public List<grade> gradeall(){
        return gradeMapper.gradeall();
    }
    public  boolean updategrade( int number, String paperid,String chengji){
        return gradeMapper.updategrade(number,paperid,chengji);
    }

    public List<grade> gradefail(String classa){
        return gradeMapper.gradefail(classa);
    }
    public List<grade> gradefailpaper( String paperid){
        return  gradeMapper.gradefailpaper(paperid);
    }
}
