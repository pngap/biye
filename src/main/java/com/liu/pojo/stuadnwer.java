package com.liu.pojo;

public class stuadnwer {
    public int stuid;
    public String paperid;
    public String questionid;
    public String stuanwer;

    public String zhuantai;
    public String classa;

    @Override
    public String toString() {
        return "stuadnwer{" +
                "stuid=" + stuid +
                ", paperid='" + paperid + '\'' +
                ", questionid='" + questionid + '\'' +
                ", stuanwer='" + stuanwer + '\'' +
                ", zhuantai='" + zhuantai + '\'' +
                ", classa='" + classa + '\'' +
                '}';
    }

    public String getZhuantai() {
        return zhuantai;
    }

    public void setZhuantai(String zhuantai) {
        this.zhuantai = zhuantai;
    }

    public String getClassa() {
        return classa;
    }

    public void setClassa(String classa) {
        this.classa = classa;
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

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getStuanwer() {
        return stuanwer;
    }

    public void setStuanwer(String stuanwer) {
        this.stuanwer = stuanwer;
    }
}
