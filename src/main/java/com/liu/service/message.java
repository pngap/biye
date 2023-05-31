package com.liu.service;

import com.liu.pojo.message1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface message {
    public  boolean insertmessage(message1 message);
    public List<message1> all();
    public List<message1> selectone( String number);
}
