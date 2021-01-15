package com.day06.homework.test7;

public class Test07 {
    public static void main(String[] args) {
        MyArrays a = new MyArrays();
        int[] arr = new int[]{12,34,5,63,11,2,0,-34,88,43,2,-1};

        a.show(arr);
        a.sort(arr);
        a.show(arr);

        System.out.println(a.indexOf(arr,0));

        a.show(a.copy(arr,5));

    }
}
