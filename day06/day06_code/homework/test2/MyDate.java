package com.day06.homework.test2;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String show(){
        return year + "年" + month + "月" + day + "日";
    }
}
