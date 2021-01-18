package com.day07.homework;

public class PassParamDemo {
    public void doubleNumber(int num){
        num *= 2;
    }
    public void toUpperCase(char letter){
        letter += 32;
    }
    public void expandCircle(Circle c ,double times){
        c.radius *= times;
    }
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
class Test04 {
    public static void main(String[] args){
        PassParamDemo p = new PassParamDemo();

        int x = 1;
        p.doubleNumber(x);
        System.out.println("x = " + x);

        char letter = 'a';
        p.toUpperCase(letter);
        System.out.println(letter);

        Circle c = new Circle();
        c.radius = 1.0;

        p.expandCircle(c, 5);
        System.out.println("半径：" + c.radius);

        int[] arr = {3,4,2,7,1};
        p.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
