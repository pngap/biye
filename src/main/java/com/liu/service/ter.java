package com.liu.service;

import com.liu.pojo.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ter {
    List<ter> selectone(String number) ;

    //读取全部
    List<ter> selectAll() ;
    boolean updatater1(ter ter);
    public boolean insertter1(ter ter);
    public boolean updateterpwd( String number,  String pwd);
}
