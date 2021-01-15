package com.day06.homework.test6;

public class MathTools {
    int add(int a, int b) {
        return a + b;
    }//：求a+b

    int subtract(int a, int b) {
        return a - b;
    }//：求a-b

    int mutiply(int a, int b) {
        return a * b;
    }//：求a*b

    int divide(int a, int b) {
        return a / b;
    }//：求a/b

    int remainder(int a, int b) {
        return a % b;
    }//：求a%b

    int max(int a, int b) {
        return (a > b) ? a : b;
    }//：求a和b中的最大值


    int min(int a, int b) {
        return (a < b) ? a : b;
    }//：求a和b中的最小值

    boolean equals(int a, int b) {
        return (a == b) ? true : false;
    }//：判断a和b是否相等

    boolean isEven(int a) {
        return (a % 2 == 0) ? true : false;
    }//：判断a是否是偶数

    boolean isPrimeNumer(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return true;
            }
        }
        return false;
    }//：判断a是否是素数

    int round(double d) {
        return (int) (d + 0.5);
    }//：返回d的四舍五入后的整数值
}
