package com.liu.mapper;

import com.liu.pojo.Stu;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface terMapper {
    public List<ter> terselectall();

    public List<ter> terselectone(@Param("number") String number);
    public boolean updatater1(ter ter);
    public boolean insertter1(ter ter);
    public boolean updateterpwd(@Param("number") String number,@Param("pwd") String pwd);
}
