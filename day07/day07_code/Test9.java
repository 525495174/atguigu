package com.day07.homework;

public class Test9 {
    public int sumTaijie(int nums){
        if (nums <= 2){
            return nums;
        }else {
            return sumTaijie(nums - 1) + sumTaijie(nums - 2);
        }
    }
}
class Test09{
    public static void main(String[] args) {
        Test9 d = new Test9();

        System.out.println(d.sumTaijie(2));
        System.out.println(d.sumTaijie(3));
        System.out.println(d.sumTaijie(4));
        System.out.println(d.sumTaijie(5));
    }
}