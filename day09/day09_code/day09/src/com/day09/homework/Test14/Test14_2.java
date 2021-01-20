package com.day09.homework.Test14;

public class Test14_2 {
    public void bianLi(Graphic[] graphics){
        for (int i = 0; i < graphics.length; i++) {
            System.out.println(graphics[i].getInfo());
        }
    }
    public void sort(Graphic[] graphics){
        for (int i = 0; i < graphics.length -1; i++) {
            for (int j = 0; j < graphics.length-1-i; j++) {
                if (graphics[j].getArea() > graphics[j+1].getArea()){

                    Graphic temp = graphics[j];
                    graphics[j] = graphics[j+1];
                    graphics[j+1] = temp;

                }

            }

        }

    }

    public static void main(String[] args) {
        Test14_2 test = new Test14_2();
        Graphic[] all = new Graphic[] {
                new Circle(8),
                new Rectangle(13,9),
                new Triangle(9,12,15)
        };
        test.bianLi(all);
        System.out.println("---------------------------");
        test.sort(all);
        test.bianLi(all);
    }
}
