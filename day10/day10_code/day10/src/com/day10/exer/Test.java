package com.day10.exer;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        Runner r1 = new Rabbit();
        Runner t1 = new Tortoise();
        Swimming t2 = new Tortoise();

        r1.run();
        t2.swim();
        t1.run();
        ((Tortoise) t1).swim();

        System.out.println("------------------------");
        master.showInfo(t1);
        master.showInfo(r1);
        master.showInfo1(t2);
    }
}
