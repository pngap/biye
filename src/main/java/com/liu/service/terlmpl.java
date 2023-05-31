package com.liu.service;

import com.liu.mapper.StuMapper;
import com.liu.mapper.terMapper;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class terlmpl {
    @Autowired
    private terMapper terMapper;
    public List<ter> selectone(String number)  {
        // TODO 自动生成的方法存根

        return    terMapper.terselectone(number);
    }

    public List<ter> selectAll()  {

        return  terMapper.terselectall();
    }
    public boolean updatater1(ter ter){

        return  terMapper.updatater1(ter);
    }
    public boolean insertter1(ter ter){

        return terMapper.insertter1(ter);
    }
    public boolean updateterpwd( String number, String pwd){
        return  terMapper.updateterpwd(number,pwd);
    }
}
