package com.day09.homework.Test13;

public class Designer extends Prorammer {
    private long bonus;

    public Designer() {
    }

    public Designer(long number, String name, int age, long salary, long bonus) {
        super(number, name, age, salary);
        this.bonus = bonus;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t\t" + bonus;
    }
}
