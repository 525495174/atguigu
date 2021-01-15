package com.day06.homework.test1;

public class Test01 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.age = 23;
        employee1.name = "张三";
        employee1.number = 1;
        employee1.salary = 10000;

        employee2.age = 22;
        employee2.name = "李四";
        employee2.number = 2;
        employee2.salary = 11000;

        employee1.show();
        employee2.show();
    }
}
