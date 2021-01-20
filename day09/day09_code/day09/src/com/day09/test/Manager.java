package com.day09.test;

public class Manager extends SalaryEmployee{
    private double bonusRate;

    public Manager() {

    }

    public Manager(String name, long salary, int workDays, int vocation, double bonusRate) {
        super(name, salary, workDays, vocation);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double earning() {
        return super.earning() * (1+bonusRate);
    }
}
