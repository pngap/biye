package com.liu.pojo;

public class message1 {
    public  String fasongnumber;
    public  String number;
    public  String neirong;
    public  String timea;

    @Override
    public String toString() {
        return "magess{" +
                "fasongznumber=" + fasongnumber +
                ", number=" + number +
                ", nerong='" + neirong + '\'' +
                ", timea='" + timea + '\'' +
                '}';
    }

    public String getFasongznumber() {
        return fasongnumber;
    }

    public void setFasongznumber(String fasongznumber) {
        this.fasongnumber = fasongznumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNerong() {
        return neirong;
    }

    public void setNerong(String nerong) {
        this.neirong = nerong;
    }

    public String getTimea() {
        return timea;
    }

    public void setTimea(String timea) {
        this.timea = timea;
    }
}
