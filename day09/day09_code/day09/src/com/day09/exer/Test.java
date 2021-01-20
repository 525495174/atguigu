package com.day09.exer;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        System.out.println("传参多态:");
        Pet pet1 = new Dog();
        master.playWithPet(pet1);
        System.out.println();

        Pet pet2 = new Cat();
        master.playWithPet(pet2);
        System.out.println();

        Pet pet3 = new Bird();
        master.playWithPet(pet3);
        System.out.println("------------------------");
        System.out.println("创建多态:");

        pet1.play();
        System.out.println();
        pet2.play();
        System.out.println();
        pet3.play();
    }
}
