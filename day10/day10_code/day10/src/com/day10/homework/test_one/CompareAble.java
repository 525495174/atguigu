package com.day10.homework.test_one;

public interface CompareAble {
    public default void compare(Apples a1,Apples a2){
        System.out.println("默认挑大的:");
        if (a1.getSize() > a2.getSize()){
            System.out.println(a1);
        }else{
            System.out.println(a2);
        }
    }
}
