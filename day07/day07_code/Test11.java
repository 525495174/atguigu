package com.day07.homework;


public class Test11 {
    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i);
    }
    public static void change(int i){
        i++;
    }
}