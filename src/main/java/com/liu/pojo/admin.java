package com.liu.pojo;

public class admin {
   public  String admin;
    public  String name;

    public Integer getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "admin{" +
                "admin='" + admin + '\'' +
                ", name='" + name + '\'' +
                ", pwd=" + pwd +
                ", radion=" + radion +
                '}';
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public  Integer pwd;
    public  int radion;
   public  int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setPwd(Integer pwd) {
        this.pwd = pwd;
    }

    public int getRadion() {
        return radion;
    }

    public void setRadion(int radio) {
        this.radion = radio;
    }
}

