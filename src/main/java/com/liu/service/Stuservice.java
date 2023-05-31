package com.liu.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import com.liu.pojo.Stu;

import java.util.List;

//@Service("Stuservice")
public interface Stuservice {
    //显示学生
    //检查
    List<Stu> selectone(String number) ;

    //读取全部
    List<Stu> selectAll() ;
    boolean updatastu1(Stu stu);
    public List<Stu> name(String number);
    public List<Stu> stuselectone1(String name);
    public boolean updatestupwd(String number, String pwd);
}
