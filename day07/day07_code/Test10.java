package com.day07.homework;

public class Test10 {
        public static void main(String[] args) {
            Other o = new Other();
            new Test10().addOne(o);
            System.out.println(o.i);
        }

        public void addOne(Other o){
            o.i++;
        }

}
class Other{
    public int i;
}
