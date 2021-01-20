package com.day09.homework.Test15;

public class Man extends Person {
    @Override
    public void eat() {
        System.out.print("男人吃饭,大口吃肉   -->");
    }

    @Override
    public void toilet() {
        System.out.print("男人上男厕所   -->");
    }
    public void smoke(){
        System.out.println("抽烟");
    }
}
