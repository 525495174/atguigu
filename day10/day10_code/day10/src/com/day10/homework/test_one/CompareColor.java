package com.day10.homework.test_one;

public class CompareColor implements CompareAble {
    @Override
    public void compare(Apples a1, Apples a2) {
        System.out.println("挑红色的:");
        if (a1.getColor().equals("红色")){
            System.out.println(a1);
        }else if (a2.getColor().equals("红色")){
            System.out.println(a2);
        }else{
            System.out.println("没有红色苹果");
        }
    }
}
