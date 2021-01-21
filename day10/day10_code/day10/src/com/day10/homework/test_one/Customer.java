package com.day10.homework.test_one;

public class Customer {
    private String level;
    private int id;

    public Customer() {
    }

    public Customer(String level, int id) {
        this.level = level;
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "-" + level;
    }
}
