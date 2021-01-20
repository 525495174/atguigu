package com.day09.homework.Test13;

public class Employee {

    private long number;
    private String name;
    private int age;
    private long salary;

    public Employee() {
    }

    public Employee(long number, String name, int age, long salary) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    public String getInfo(){
        return number + "\t\t" + name + "\t\t" + age + "\t\t" + salary;
    }
}
