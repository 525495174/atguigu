package com.day06.homework.test5;

public class Triangle {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean  isRightTriangle(){
        if (a*a == b*b + c*c || b*b == a*a + c*c ||c*c == b*b + a*a){
            return true;
        }else {
            return false;
        }
    }

    boolean isIsoscelesTriangle(){
        if (a == b || a == c || b == c){
            return true;
        }else{
            return false;
        }
    }

    boolean isEquilateralTriangle(){
        if (a == b && a == c){
            return true;
        }else {
            return false;
        }
    }

    double getArea(){
        double p = (a+b+c) / 2;
        return Math.sqrt(p*(p-a)*(p-c)*(p-b));
    }

    double getLength(){
        return a+b+c;
    }
}