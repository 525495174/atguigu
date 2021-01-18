package com.day07.homework;

public class DiGuiExer {
    public int sumRabbits(int months){
        if (months == 1 || months == 2){
            return 1;
        }else{
            return sumRabbits(months -1 ) + sumRabbits(months - 2);
        }
    }
}
class Test06{
    public static void main(String[] args) {
        DiGuiExer d = new DiGuiExer();

        System.out.println(d.sumRabbits(3));
        System.out.println(d.sumRabbits(4));
        System.out.println(d.sumRabbits(5));
        System.out.println(d.sumRabbits(6));
    }
}