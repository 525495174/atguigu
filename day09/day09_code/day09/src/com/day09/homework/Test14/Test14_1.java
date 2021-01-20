package com.day09.homework.Test14;

public class Test14_1 {

    public boolean equalsArea(Graphic graphic1,Graphic graphic2){
        return (graphic1.getArea() == graphic2.getArea());
    }
    public Graphic bigArea(Graphic graphic1,Graphic graphic2){
        return (graphic1.getArea() > graphic2.getArea())? graphic1 : graphic2;
    }

    public static void main(String[] args) {
        Graphic c1 = new Circle(5);
        Graphic r1 = new Rectangle(5,12);
        Graphic t1 = new Triangle(9,12,15);

        System.out.println("c1:" + c1.getInfo());
        System.out.println("r1:" + r1.getInfo());
        System.out.println("t1:" + t1.getInfo());
        System.out.println("---------------------------------");
        Test14_1 test = new Test14_1();
        System.out.println("c1,r1面积是否相等:" + test.equalsArea(c1,r1));
        System.out.println("c1,t1返回面积大的那个:" + test.bigArea(c1,t1).getArea());

    }
}
