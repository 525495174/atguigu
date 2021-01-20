package com.day09.test;

public class Test {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];

        all[0] = new HourEmployee("刘德华", 8, 500);
        all[1] = new SalaryEmployee("郭富城", 17000, 22, 1);
        all[2] = new Manager("孙红雷", 25000, 22, 0, 0.3);

        double sum = 0;
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
            sum += all[i].earning();
        }
        System.out.println("总额：" + sum);
    }
}
