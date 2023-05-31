package com.liu.mapper;

import com.liu.pojo.grade;
import com.liu.pojo.pigai;
import com.liu.pojo.stuadnwer;
import org.apache.ibatis.annotations.Param;

public interface stuanwerMapper {
    public boolean insertstuanwer(stuadnwer stuadnwer);
  public boolean  insertgrade(grade grade);
  public  boolean updatazhantai(@Param("zhuantai") String zhuantai,@Param("paperid") String paperid,@Param("stuid") String stuid);
}
