package com.day09.homework.Test14;

public class Triangle extends Graphic {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double area = 0;
        double temp = (a+b+c)/2;
        area = Math.sqrt(temp*(temp-a)*(temp-b)*(temp-c));
        return area;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\ta:" + a +"\tb:" + b + "\tc:" + c;
    }
}
