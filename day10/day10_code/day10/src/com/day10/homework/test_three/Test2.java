package com.day10.homework.test_three;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        int num;
        while(isFlag){
            System.out.print("请输入月份(输入13退出):");
            num = scan.nextInt();
            if (num > 0 && num < 13){
                System.out.println(Month.getByValue(num));
            }else{
                isFlag = false;
            }
        }
    }
}
