package com.day10.homework.test_one;

public class Test5 {
    public static void main(String[] args) {
        Customer[] all = new Customer[15];

        for (int i = 0; i < all.length; i++) {
            all[i] = new Customer();
            all[i].setId(i+1);
        }

        Receptionist r1 = new Receptionist();
        Receptionist r2 = new Receptionist();
        Receptionist r3 = new Receptionist();

        for (int i = 0; i < all.length; i++) {
            if (all[i].getId() <= 5){
                r1.setLevel(all[i],new V1Filter());
            }else if(all[i].getId() <= 10){
                r2.setLevel(all[i],new V2Filter());
            }else{
                r3.setLevel(all[i],new AFilter());
            }
        }

        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
