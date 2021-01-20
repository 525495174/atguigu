package com.day09.homework.Test14;

public class Rectangle extends Graphic {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t长:" + length + "\t宽:" + width;
    }
}
