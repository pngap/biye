package com.liu.service;

import com.liu.mapper.messageMapper;
import com.liu.pojo.message1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class messagelmpl {
    @Autowired
    public messageMapper mapper;
    public  boolean insertmessage(message1 message) {

        return  mapper.insertmessage(message);
    }
    public List<message1> all(){
        return mapper.all();
    }
    public List<message1> selectone( String number){
        return  mapper.selectone(number);
    }
}
