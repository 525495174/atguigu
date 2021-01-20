package com.day09.test1;

public class Triangle extends Graphic{

    private double height;
    private double width;

    public Triangle() {
    }
    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width/2;
    }
}
