package com.liu.service;

import com.liu.mapper.StuMapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.liu.pojo.Stu;

import javax.annotation.Resource;
import java.util.List;



@Component
@Service
public class Stuservicelmpl implements Stuservice {
    @Autowired
    private  StuMapper stuMapper;


    public List<Stu> selectone(String number)  {
        // TODO 自动生成的方法存根
        System.out.println(number);
    return    stuMapper.stuselectone(number);
    }

    public List<Stu> selectAll()  {

        return stuMapper.stuselectall();
    }
   public boolean updatastu1(Stu stu){

        return  stuMapper.updatastu1(stu);
   }
    public List<Stu> name( String number){

        return stuMapper.name(number);
    }
    public List<Stu> stuselectone1(String name){
        return  stuMapper.stuselectone1(name);
    }
    public boolean updatestupwd(String number, String pwd){
        return stuMapper.updatestupwd(number,pwd);
    }
    }


