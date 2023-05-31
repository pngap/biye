package com.liu.service;

import com.liu.mapper.StuMapper;
import com.liu.mapper.perperMapper;
import com.liu.pojo.pigai;
import com.liu.pojo.pigaixxa;
import com.liu.pojo.testpaper;
import com.liu.pojo.text;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.soap.Text;
import java.util.List;
@Component
@Service
public class perperservicelmpl {
    @Autowired
    private perperMapper perperMapper;
    public boolean insertall(text text) {

        return perperMapper.insertall(text);
    }
    public boolean insetpaper( testpaper testpaper){
        return perperMapper.insetpaper(testpaper);
    }
    public boolean update(testpaper testpaper){

        return  perperMapper.update( testpaper);
    }
    public List<pigai> pigaiall(){

        return  perperMapper.pigaiall();
    }
    public List<pigaixxa> pigaixx(int stuid, String paperid){
        return  perperMapper.pigaixx(stuid,paperid);
    }
    public List<pigai> pigaiter(String classa){

        return  perperMapper.pigaiter(classa);
    }
    public List<testpaper> testpapernumber( String number){

        return  perperMapper.testpapernumber(number);
    }
}
