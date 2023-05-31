package com.liu.service;

import com.liu.mapper.homeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class homelmpl {
    @Autowired
    public homeMapper homeMapper;
    public int stuhome(){
        return  homeMapper.stuhome();
    }
    public int banjihome(){
        return homeMapper.banjihome();
    }
    public int gradepasshome(){
        return  homeMapper.gradepasshome();
    }
    public int gradefailhome(){
        return  homeMapper.gradefailhome();
    }
}
