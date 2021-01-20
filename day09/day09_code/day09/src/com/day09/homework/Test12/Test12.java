package com.day09.homework.Test12;

public class Test12 {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(4,3,5);

        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());

        System.out.println();

        System.out.println("equals:" + triangle1.equals(triangle2));

        System.out.println();

        System.out.println("triangle1(3,4,5)面积:" + triangle1.getArea());
        System.out.println("triangle2(4,3,5)面积:" + triangle2.getArea());

        System.out.println();

        System.out.println("triangle1(4,3,5)周长:" + triangle1.getPiremter());
        System.out.println("triangle2(4,3,5)周长:" + triangle2.getPiremter());



    }
}
