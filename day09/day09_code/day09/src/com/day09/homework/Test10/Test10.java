package com.day09.homework.Test10;

public class Test10 {
    public static void main(String[] args) {
        Person[] all = new Person[2];

        all[0] = new Man();
        all[1] = new Woman();

        for (int i = 0; i < all.length; i++) {
            all[i].pee();
        }
    }
}
