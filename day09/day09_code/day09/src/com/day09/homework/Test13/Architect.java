package com.day09.homework.Test13;

public class Architect extends Designer {
    private int nums;

    public Architect() {
    }

    public Architect(long number, String name, int age, long salary, long bonus, int nums) {
        super(number, name, age, salary, bonus);
        this.nums = nums;
    }

    public double getRate() {
        return nums;
    }

    public void setRate(int nums) {
        this.nums = nums;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t\t" + nums;
    }
}
