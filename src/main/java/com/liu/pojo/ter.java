package com.liu.pojo;

public class ter {
    @Override
    public String toString() {
        return "ter{" +
                "username=" + username +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", xingbei='" + xingbei + '\'' +
                ", nianling='" + nianling + '\'' +
                ", pwd=" + pwd +
                ", bianjibum='" + bianjibum + '\'' +
                '}';
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbei() {
        return xingbei;
    }

    public void setXingbei(String xingbei) {
        this.xingbei = xingbei;
    }

    public int getNianling() {
        return nianling;
    }

    public void setNianling(int nianling) {
        this.nianling = nianling;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getBianjibum() {
        return bianjibum;
    }

    public void setBianjibum(String bianjibum) {
        this.bianjibum = bianjibum;
    }

    public int username;
    public  String number;
    public  String name;
    public  String xingbei;
    public int nianling ;

    public  int pwd;
    public String bianjibum ;
    public  int index;
    public  String classname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
