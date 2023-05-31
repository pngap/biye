package com.liu.service;

import com.liu.pojo.pigai;
import com.liu.pojo.pigaixxa;
import com.liu.pojo.testpaper;
import com.liu.pojo.text;
import org.apache.ibatis.annotations.Param;

import javax.xml.soap.Text;
import java.util.List;

public interface perperservice {
    boolean insertall(text text);
     boolean insetpaper(testpaper testpaper);
    public boolean update(testpaper testpaper);
    public List<pigai> pigaiall();
    public List<pigaixxa> pigaixx(int stuid,  String paperid);
    public List<pigai> pigaiter( String classa);
    public List<testpaper> testpapernumber(String number);
}
