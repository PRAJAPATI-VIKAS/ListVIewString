package com.example.liststring;

import java.util.ArrayList;

public class Teacher{
    String name;
    String course;
    public Teacher(String name, String course)
    {
        this.name = name;
        this.course = course;
    }

    public String getName()
    { return name; }

    public String getCourse()
    { return course; }
    public  static ArrayList<Teacher> get10RandomTeacher(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("VIKAS","Android development"));
        teachers.add(new Teacher("DEEPAK","WEB APPLICATION"));
        teachers.add(new Teacher("DIVYA","PATA NAHI"));
        teachers.add(new Teacher("GAUTAM","TATTI KAISE NIKAL TE HAI"));
        teachers.add(new Teacher("UMANG","ONLY NOOBDA"));
        teachers.add(new Teacher("BHOOMI","JIDER SAHIL UDER BHOOMI"));
        teachers.add(new Teacher("CHIRAG","FOREIGNER"));
        teachers.add(new Teacher("SAHIL","KINDOJOY"));
        teachers.add(new Teacher("KARTIK","ENJOY LIFE "));

        return teachers;

    }
}
