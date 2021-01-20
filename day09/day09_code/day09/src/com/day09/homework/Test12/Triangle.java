package com.day09.homework.Test12;

import java.util.Objects;

public class Triangle {
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
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        if (o == this){
            flag = true;
        }else if(o instanceof Triangle){
            Triangle triangle = (Triangle)o;
            if (triangle.a == this.a && triangle.b == this.b && triangle.c == this.c)
            {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    public double getArea(){
        double area = 0;
        double temp = (a+b+c)/2;
        area = Math.sqrt(temp*(temp-a)*(temp-b)*(temp-c));
        return area;
    }

    public double getPiremter(){
        return a+b+c;
    }

}
