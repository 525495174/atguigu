package com.day10.homework.test_one;

public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("BBBB");
    }
}
