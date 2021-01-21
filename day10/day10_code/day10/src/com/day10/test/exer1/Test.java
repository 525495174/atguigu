package com.day10.test.exer1;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.print("请输入月份(1-12,):");
            int month = scan.nextInt();
            System.out.println(Month.getByValue(month));


    }
}
