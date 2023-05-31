package com.liu.service;

import org.apache.ibatis.annotations.Param;

public interface del {
    public boolean delbanji(String classroom);
    public boolean delstu(String number);
    public boolean delter(String number);
    public boolean delpaper(String number);
    public boolean delmessage(String number);
    public boolean delgrade( String number, String paperid);
}
