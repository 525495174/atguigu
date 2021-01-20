package com.day09.test1;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        Graphic[] all = new Graphic[3];

        all[0] = new Circle(2);
        all[1] = new Triangle(4,6);
        all[2] = new Juxin(5,6);

        for (int i = 0; i < all.length; i++) {
            System.out.println(master.showInfo(all[i]));
        }
    }
}
