package com.liu.service;

import com.liu.mapper.loginMapper;
import com.liu.pojo.Stu;
import com.liu.pojo.admin;
import com.liu.pojo.ter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class loginlmpl {
    @Autowired
    private loginMapper loginMapper;
    public List<admin> loginadmin(String  admin,int pwd){

        return loginMapper.loginadmin(admin,pwd);
    }
    public List<Stu> loginstu(String username,int pwd){
        return  loginMapper.loginstu(username,pwd);
    }
    public List<ter> loginter(String username,int pwd){
        return  loginMapper.loginter(username,pwd);
    }
    public boolean updateadmin( String admin, int pwd){
        return  loginMapper.updateadmin(admin,pwd);
    }
    public boolean updatestu( String  username, int pwd){
        return  loginMapper.updatestu(username,pwd);
    }
    public boolean updateter(String username,int pwd){
        return  loginMapper.updateter(username,pwd);
    }
}
