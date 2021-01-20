package com.day09.homework;

public class C extends B {
    private int numc = 30;

    public C() {
    }

    public C(int numa, int numb, int numc) {
        super(numa, numb);
        this.numc = numc;
    }

    public int getNumc() {
        return numc ;
    }

    public void setNumc(int numc) {
        this.numc = numc;
    }

    @Override
    public void showA() {
        System.out.println("A类中numa:" + getNuma());
    }

    @Override
    public void showB() {
        System.out.println("B类中numb:" +getNumb());
    }

    public void showC(){
        System.out.println("C类中numc:" +getNumc());
    }
}
