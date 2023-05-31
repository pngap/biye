package com.liu.service;

import com.liu.mapper.delMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class dellmpl {
    @Autowired
    public delMapper delMapper;
    public boolean delbanji(String classroom){

        return  delMapper.delbanji(classroom);
    }
    public boolean delstu(String number){
        return  delMapper.delstu(number);
    }
    public boolean delter(String number){
        return  delMapper.delter(number);
    }
    public boolean delpaper(String number){
        return  delMapper.delpaper(number);
    }
    public boolean delmessage(String number){
        return  delMapper.delmessage(number);
    }
    public boolean delgrade( String number, String paperid){
        return delMapper.delgrade(number,paperid);
    }
}
