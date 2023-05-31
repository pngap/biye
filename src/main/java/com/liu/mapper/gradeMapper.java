package com.liu.mapper;

import com.liu.pojo.grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface gradeMapper {
    public List<grade> grade(@Param("paperid") String paperid);
    public List<grade> gradefailpaper(@Param("paperid") String paperid);
    public List<grade> gradefail(@Param("classa") String classa);
    public List<grade> grade1(@Param("number") String number);
    public List<grade> gradeclass(@Param("classa") String classa);
    public List<grade> gradeall();
    public  boolean updategrade(@Param("number") int number,@Param("paperid") String paperid,@Param("chengji") String chengji);
}
