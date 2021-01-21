package com.day10.exer;

public class Tortoise implements Swimming,Runner{
    @Override
    public void swim() {
        System.out.println("乌龟游得快");
    }

    @Override
    public void run() {
        System.out.println("乌龟跑得慢");
    }
}
