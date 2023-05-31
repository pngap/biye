package com.liu.pojo;

public class Stu {
    private String username;
    private String number;
    private String name;
    private String xueyan;
    private String zhany;
    private int nianji;
    public  int index;
    public String classname;

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

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    private  String banji;
    private int pwd;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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

    public String getXueyan() {
        return xueyan;
    }

    public void setXueyan(String xueyan) {
        this.xueyan = xueyan;
    }

    public String getZhany() {
        return zhany;
    }

    public void setZhany(String zhany) {
        this.zhany = zhany;
    }

    public int getNianji() {
        return nianji;
    }

    public void setNianji(int nianji) {
        this.nianji = nianji;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "username='" + username + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", xueyan='" + xueyan + '\'' +
                ", zhany='" + zhany + '\'' +
                ", nianji=" + nianji +
                ", index=" + index +
                ", banji='" + banji + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
