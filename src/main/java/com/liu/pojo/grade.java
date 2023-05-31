package com.liu.pojo;

public class grade {
    public String number;
    public String name;
    public String banji;
    public  String id;
    @Override
    public String toString() {
        return "grade{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", banji='" + banji + '\'' +
                ", paperid='" + paperid + '\'' +
                ", chengji='" + chengji + '\'' +
                '}';
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

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public String getPaperid() {
        return paperid;
    }

    public void setPaperid(String paperid) {
        this.paperid = paperid;
    }

    public String getChengji() {
        return chengji;
    }

    public void setChengji(String chengji) {
        this.chengji = chengji;
    }



    public String paperid;
    public  String chengji;
    public String classname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
