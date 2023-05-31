package com.liu.mapper;

import com.liu.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import javax.xml.soap.Text;
import java.util.List;

public interface perperMapper {

    public boolean insertall(text text);
    public boolean insetpaper(testpaper testpaper);
    public boolean update(testpaper testpaper);
    public List<pigai> pigaiall();
    public List<pigai> pigaiter(@Param("classa") String classa);
    public List<pigaixxa> pigaixx(@Param("stuid") int stuid,@Param("paperid") String paperid);
    public List<testpaper> testpapernumber(@Param("number") String number);
}
