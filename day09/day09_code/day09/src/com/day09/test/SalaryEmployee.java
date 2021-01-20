package com.day09.test;

public class SalaryEmployee extends Employee{
    private long salary;
    private int workDays;
    private int vocation;

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name, long salary, int workDays, int vocation) {
        super(name);
        this.salary = salary;
        this.workDays = workDays;
        this.vocation = vocation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getVocation() {
        return vocation;
    }

    public void setVocation(int vocation) {
        this.vocation = vocation;
    }

    @Override
    public double earning() {
        return salary - (salary / workDays) * vocation;
    }
}
