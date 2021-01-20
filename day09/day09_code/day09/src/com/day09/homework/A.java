package com.day09.homework;

public abstract class A {
    private int numa = 10;

    public A() {
    }

    public A(int numa) {
        this.numa = numa;
    }

    public int getNuma() {
        return numa;
    }

    public void setNuma(int numa) {
        this.numa = numa;
    }

    public abstract void showA();
}
