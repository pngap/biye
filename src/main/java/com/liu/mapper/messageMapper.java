package com.liu.mapper;

import com.liu.pojo.message1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface messageMapper {
    public  boolean insertmessage(message1 message);
    public List<message1> all();
    public List<message1> selectone(@Param("number") String number);
}
