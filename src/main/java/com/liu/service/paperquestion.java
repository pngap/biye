package com.liu.service;

import com.liu.mapper.paperquestionMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface paperquestion {
    public List<paperquestionMapper> all( String  papernumber);
}
