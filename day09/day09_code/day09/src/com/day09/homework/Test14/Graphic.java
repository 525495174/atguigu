package com.day09.homework.Test14;

public abstract class Graphic {

    public abstract double getArea();
    public abstract double getPerimeter();
    public  String getInfo(){
        return "面积:" + getArea() + "\t周长:" + getPerimeter();
    }



}
