package com.day09.homework;

public abstract class B extends A {
    private int numb = 20;

    public B() {
    }

    public B(int numa, int numb) {
        super(numa);
        this.numb = numb;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public abstract void showB();
}
