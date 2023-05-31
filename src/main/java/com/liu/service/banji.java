package com.liu.service;

import com.liu.pojo.Stu;
import com.liu.pojo.classroom;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface banji {
    public List<Stu> banji1(String number);
    public List<Stu> banji2(Stu stu);
    public List<ter> banjiter1(String number);
    public List<ter> banjiter2( String bianjibum);
    public List<classroom> banjiall();
    public boolean banjitianji(classroom classroom);
    public boolean updatabanji(classroom classroom);
    public List<Stu> banji3(@Param("banji") String banji);
}
