package com.liu.service;

import com.liu.mapper.paperquestionMapper;
import com.liu.pojo.paperquestiont;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
@Component
@Service
public class paperquestionlmpl {
    @Autowired
    public paperquestionMapper paperquestionMapper;
    public List<paperquestiont> all(String  papernumber){
        return paperquestionMapper.all(papernumber);
    }
}
