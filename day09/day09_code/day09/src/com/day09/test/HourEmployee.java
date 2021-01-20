package com.day09.test;

public class HourEmployee extends Employee{

    private int workHours;
    private int hourMoney;

    public HourEmployee() {
    }
    public HourEmployee(String name, int workHours, int hourMoney) {
        super(name);
        this.workHours = workHours;
        this.hourMoney = hourMoney;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHourMoney() {
        return hourMoney;
    }

    public void setHourMoney(int hourMoney) {
        this.hourMoney = hourMoney;
    }

    @Override
    public double earning() {
        return workHours * hourMoney;
    }
}
