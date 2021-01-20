package com.day09.homework.Test15;

public class Woman extends Person {
    @Override
    public void eat() {
        System.out.print("女人吃饭,细嚼慢咽   -->");
    }

    @Override
    public void toilet() {
        System.out.print("女人去女厕所   -->");
    }

    public void makeup(){
        System.out.println("化妆");
    }
}
