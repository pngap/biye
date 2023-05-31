package com.liu.dao;

import org.springframework.stereotype.Component;
import com.liu.pojo.Stu;

import java.util.List;

@Component("StuDao")
public interface StuDao {
    //检查
    List<Stu> selectone(String number) throws Exception;

    //读取全部
    List<Stu> selectAll() throws Exception;

    void save();


}
