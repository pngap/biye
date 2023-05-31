package com.liu.service;

import com.liu.pojo.Stu;
import com.liu.pojo.admin;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface login {
    public List<admin> loginadmin(String admin,int pwd);
    public List<Stu> loginstu(String username,int pwd);
    public List<ter> loginter(String username,int pwd);
    public List<admin> updateadmin( String admin, int pwd);
    public List<Stu> updatestu( String  username, int pwd);
    public List<ter> updateter(String username,int pwd);

}
