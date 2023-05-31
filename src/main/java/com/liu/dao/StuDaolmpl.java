package com.liu.dao;

import com.liu.pojo.Stu;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("StuDaolmpl")
public class StuDaolmpl implements StuDao {

    public List<Stu> selectone(String number) {
        String sql = "SELECT * FROM stu where number=?";
        List<Object> params = new ArrayList<Object>();
        params.add(number);
        List<Stu> flag = BaseDao.queryRows(sql, params, Stu.class);
        return flag;
    }

    public List<Stu> selectAll() {
        String sql = "SELECT * FROM stu ";
        List<Object> params = new ArrayList<Object>();
        List<Stu> flag = BaseDao.queryRows(sql, params, Stu.class);

        // TODO 自动生成的方法存根
        return flag;
    }

    public void save() {
        System.out.println("save");

    }
}
