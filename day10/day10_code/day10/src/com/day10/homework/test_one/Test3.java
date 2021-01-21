package com.day10.homework.test_one;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("选择:");
        String str = scan.next();
        FightAble f1 = Player.Select(str);
        f1.specialFight();
        f1.commonFight();
        System.out.println("==========================");
        System.out.print("选择:");
        String str1 = scan.next();
        FightAble f2 = Player.Select(str1);
        f2.specialFight();
        f2.commonFight();

    }
}
