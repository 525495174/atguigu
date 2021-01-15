package com.day06.homework.test5;

public class Test05 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,4,5);

        System.out.println("是否是一个直角三角形:" + triangle1.isRightTriangle());

        System.out.println("是否是一个等腰三角形:"+ triangle1.isIsoscelesTriangle());

        System.out.println("是否是一个等腰三角形:" + triangle1.isEquilateralTriangle());

        System.out.println("三角形面积是" + triangle1.getArea());

        System.out.println("三角形周长是:"+ triangle1.getLength());
    }
}
