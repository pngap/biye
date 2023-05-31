package com.liu.mapper;

import org.apache.ibatis.annotations.Param;

public interface delMapper {
    public boolean delbanji(@Param("classroom") String classroom);
    public boolean delstu(@Param("number") String number);
    public boolean delter(@Param("number") String number);
    public boolean delpaper(@Param("number") String number);
    public boolean delmessage(@Param("number") String number);
    public boolean delgrade(@Param("number") String number,@Param("paperid") String paperid);
}
