package com.day06.homework.test4;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear(){
        if (year % 4 == 0 && year % 100 != 0 || year == 400){
            return true;
        }else{
            return false;
        }
    }
    public void set(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }
    public void puls(int years, int months, int days){
        year += years;
        month += months;
        day += days;
    }
    public void show(){
        System.out.println(year +"年"+month+"月"+day+"日");
    }
}

