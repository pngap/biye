package com.liu.pojo;

public class testpaper {
    public  String name;
    public  String number;

    @Override
    public String toString() {
        return "testpaper{" +
                "name=" + name +
                ", number=" + number +
                ", stylea='" + stylea + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStylea() {
        return stylea;
    }

    public void setStylea(String stylea) {
        this.stylea = stylea;
    }

    public  String stylea;
}
