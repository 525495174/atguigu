package com.day06.homework.test8;

public class Test08 {
    public static void main(String[] args) {
        DateCommonsTools d = new DateCommonsTools();

        System.out.println("1 " + d.getWeekName(1));
        System.out.println("8 " + d.getWeekName(8));

        System.out.println("1 " + d.getMonthName(1));
        System.out.println("13 " + d.getMonthName(13));

        System.out.println("2020.2 " + d.getTotalDaysOfMonth(2020,2));

        System.out.println("2020 " + d.getTotalDaysOfYear(2020));

        System.out.println("2020是否是闰年 " + d.isLeapYear(2020));


    }
}
