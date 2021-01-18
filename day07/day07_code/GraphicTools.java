package com.day07.homework.eneity;

public class GraphicTools {
    public void printRectangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printRectangle(int line,int column,String sign){
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
    public double getTriangleArea(double base,double height){
        double triArea = 0;
        triArea = 0.5 * base * height;
        return triArea;
    }
    public double getTriangleArea(double a,double b,double c){
        double triArea = 0;
        double p = (a + b + c) / 2;
        if(a*a == b*b + c*c||b*b == a*a + c*c||c*c == b*b + a*a) {
            triArea = Math.sqrt(p*(p-a)*(p-c)*(p-b));
        }else{
            triArea = 0;
            System.out.println("a,b,c不能组成三角形");
        }
        return triArea;
    }
}


class Test02{
    public static void main(String[] args) {
        GraphicTools test1 = new GraphicTools();

        test1.printRectangle();
        System.out.println();

        test1.printRectangle(9,9,"@");
        System.out.println();

        System.out.println("底是12,高是5的三角形面积:"+ test1.getTriangleArea(12,5));

        System.out.println("三条边为6,8,10的三角形面积:" + test1.getTriangleArea(6,8,10));
        System.out.println("三条边为6,8,9的三角形面积"+ test1.getTriangleArea(6,8,9));

    }
}