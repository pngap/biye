package com.liu.mapper;

import com.liu.pojo.paperquestiont;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface paperquestionMapper {

    public List<paperquestiont> all(@Param("papernumber") String  papernumber);
}
