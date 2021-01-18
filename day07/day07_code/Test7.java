package com.day07.homework;

public class Test7 {
    public int peachNum(int days){
        if (days == 1){
            return 4;
        }else{
            return (peachNum(days - 1)+ 1) * 2;
        }
    }
}
class Test07{
    public static void main(String[] args) {
        Test7 test7 = new Test7();

        System.out.println(test7.peachNum(2));
        System.out.println(test7.peachNum(3));
        System.out.println(test7.peachNum(4));
        System.out.println(test7.peachNum(1));
    }
}
