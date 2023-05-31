package com.liu.pojo;

public class text {
    public int id;
    public String idnumber;

    public String  text;
    public String selecta;
    public String selectb;
    public String selectc;
    public String selectd;

    public String getIdnumber() {
        return idnumber;
    }

    public String selecte;
    public String score;
    public String anwer;

    @Override
    public String toString() {
        return "text{" +
                "idnumber=" + idnumber +
                ", id=" + id +
                ", text='" + text + '\'' +
                ", selecta='" + selecta + '\'' +
                ", selectb='" + selectb + '\'' +
                ", selectc='" + selectc + '\'' +
                ", selectd='" + selectd + '\'' +
                ", selecte='" + selecte + '\'' +
                ", score='" + score + '\'' +
                ", anwer='" + anwer + '\'' +
                ", style=" + style +
                '}';
    }



    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelecta() {
        return selecta;
    }

    public void setSelecta(String selecta) {
        this.selecta = selecta;
    }

    public String getSelectb() {
        return selectb;
    }

    public void setSelectb(String selectb) {
        this.selectb = selectb;
    }

    public String getSelectc() {
        return selectc;
    }

    public void setSelectc(String selectc) {
        this.selectc = selectc;
    }

    public String getSelectd() {
        return selectd;
    }

    public void setSelectd(String selectd) {
        this.selectd = selectd;
    }

    public String getSelecte() {
        return selecte;
    }

    public void setSelecte(String selecte) {
        this.selecte = selecte;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAnwer() {
        return anwer;
    }

    public void setAnwer(String anwer) {
        this.anwer = anwer;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public int style;






}
