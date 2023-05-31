package com.liu.mapper;

import com.liu.pojo.Stu;
import com.liu.pojo.admin;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface loginMapper {
    public List<admin> loginadmin(@Param("admin") String admin,@Param("pwd") int pwd);
    public List<Stu> loginstu(@Param("username") String  username,@Param("pwd") int pwd);
    public List<ter> loginter(@Param("username") String username,@Param("pwd") int pwd);
    public boolean updateadmin(@Param("admin") String admin,@Param("pwd") int pwd);
    public boolean updatestu(@Param("username") String  username,@Param("pwd") int pwd);
    public boolean updateter(@Param("username") String username,@Param("pwd") int pwd);
}
