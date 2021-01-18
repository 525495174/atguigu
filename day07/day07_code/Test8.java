package com.day07.homework;

public class Test8 {
    public long f(int n){
        if (n == 1){
            return 1;
        }else{
            return n + f(n - 1);
        }
    }
}
class Test08{
    public static void main(String[] args) {
        Test8 d = new Test8();


        System.out.println(d.f(1));
        System.out.println(d.f(2));
        System.out.println(d.f(3));
        System.out.println(d.f(4));
        System.out.println(d.f(5));
        System.out.println(d.f(6));
    }
}