package com.liu.pojo;

public class classroom {
    public String classroom;
    public  String classname;

    @Override
    public String toString() {
        return "classroom{" +
                "classroom='" + classroom + '\'' +
                ", name='" + classname + '\'' +
                '}';
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return classname;
    }

    public void setName(String name) {
        this.classname = name;
    }
}
