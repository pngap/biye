package com.liu.service;

import com.liu.mapper.shijuanMapper;
import com.liu.pojo.testpaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class paperlmpl {
    @Autowired
    public shijuanMapper shijuanMapper;
    public List<testpaper> all()
    {
        return shijuanMapper.all();
    }
}
