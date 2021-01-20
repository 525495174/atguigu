package com.day09.test1;

public class Juxin extends Graphic{
    private double legth;
    private double width;

    public Juxin() {
    }

    public Juxin(double legth, double width) {
        this.legth = legth;
        this.width = width;
    }

    public double getLegth() {
        return legth;
    }

    public void setLegth(double legth) {
        this.legth = legth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return legth*width;
    }
}
