package com.day10.homework.test_one;

public class Test4 {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Apples a1 = new Apples(6,"绿色");
        Apples a2 = new Apples(4,"红色");

        w1.pickApple(new CompareBig(),a1,a2);
        w2.pickApple(new CompareColor(),a1,a2);

    }
}
