package com.liu.pojo;

public class pigai {
    public int stuid;
    public String paperid;

    public String name;

    public String stylea;
    public  String classa;
    public  String zhuantai;
    public  String classname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getZhuantai() {
        return zhuantai;
    }

    public void setZhuantai(String zhuantai) {
        this.zhuantai = zhuantai;
    }

    @Override
    public String toString() {
        return "pigai{" +
                "stuid=" + stuid +
                ", paperid='" + paperid + '\'' +
                ", name='" + name + '\'' +
                ", stylea='" + stylea + '\'' +
                ", classa='" + classa + '\'' +
                ", zhuantai='" + zhuantai + '\'' +
                '}';
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getPaperid() {
        return paperid;
    }

    public void setPaperid(String paperid) {
        this.paperid = paperid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStylea() {
        return stylea;
    }

    public void setStylea(String stylea) {
        this.stylea = stylea;
    }

    public String getClassa() {
        return classa;
    }

    public void setClassa(String classa) {
        this.classa = classa;
    }
}
