package com.day10.test;

public class TestSeason {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        Season s1 = Season.SPRING;
        s1.setInfo("春暖花开");
        System.out.println(spring);

    }
}
