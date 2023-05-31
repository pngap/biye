package com.liu.mapper;

import com.liu.pojo.Stu;
import com.liu.pojo.admin;
import com.liu.pojo.classroom;
import com.liu.pojo.ter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface banjiMapper  {
    public List<Stu> banji1(@Param("number") String number);
    public List<Stu> banji2(@Param("banji") String banji,@Param("xueyan") String xueyan,@Param("nianji") int nianji,@Param("zhany") String zhany);
    public List<ter> banjiter1(@Param("number") String number);
    public List<ter> banjiter2(@Param("bianjibum") String bianjibum);
    public List<classroom> banjiall();
    public boolean banjitianji(classroom classroom);
    public boolean updatabanji(classroom classroom);
    public List<Stu> banji3(@Param("banji") String banji);
}
