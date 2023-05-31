package com.liu.service;

import com.liu.mapper.banjiMapper;
import com.liu.pojo.Stu;
import com.liu.pojo.classroom;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class banjilmpl {
    @Autowired
    public banjiMapper banjiMapper;
    public List<Stu> banji1( String number){


        return  banjiMapper.banji1(number);
    }
    public List<Stu> banji2(String banji,String xueyan,int nianji, String zhany){
        return banjiMapper.banji2(banji,xueyan,nianji,zhany);
    }
    public List<com.liu.pojo.ter> banjiter1(String number){
        return banjiMapper.banjiter1(number);
    }
    public List<ter> banjiter2(String bianjibum){
        return  banjiMapper.banjiter2(bianjibum);
    }
    public List<classroom> banjiall(){

        return banjiMapper.banjiall();
    }
    public boolean banjitianji(classroom classroom){
        return  banjiMapper.banjitianji(classroom);
    }
    public boolean updatabanji(classroom classroom){
        return  banjiMapper.updatabanji(classroom);
    }
    public List<Stu> banji3(String banji){
        return  banjiMapper.banji3(banji);
    }
}
