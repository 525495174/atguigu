package com.day10.homework.test_one;

public class Apples {
    private int size;
    private String color;

    public Apples() {
    }

    public Apples(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size + " - " + color;
    }
}
