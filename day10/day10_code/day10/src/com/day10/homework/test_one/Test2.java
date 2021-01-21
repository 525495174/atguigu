package com.day10.homework.test_one;

public class Test2 {
    public static void main(String[] args) {
        Star s1 = new Star();
        s1.shine();
        System.out.println("========================");
        Universe u = new Sun();
        u.doAnything();
        Star sun = (Star)u;
        sun.shine();

        System.out.println("========================");
        Star sun1 = new Sun();
        sun1.shine();
        Universe u1 = (Universe)sun1;
        u1.doAnything();
    }
}
