package com.day10.homework.test_three;

public class Test3 {
    public static void main(String[] args) {

        Payment[] all = Payment.values();

        for (int i = 0; i < all.length; i++) {
            all[i].pay();
        }


    }
}
