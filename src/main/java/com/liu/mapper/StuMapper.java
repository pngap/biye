package com.liu.mapper;

import com.liu.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StuMapper {
    public List<Stu> stuselectall();

    public List<Stu> stuselectone(@Param("number") String number);
    public List<Stu> stuselectone1(@Param("name") String name);
    public List<Stu> updata(@Param("number") String number);
    public boolean updatastu1(Stu stu);
    public List<Stu> name(@Param("number") String number);
    public boolean updatestupwd(@Param("number") String number,@Param("pwd") String pwd);

}
