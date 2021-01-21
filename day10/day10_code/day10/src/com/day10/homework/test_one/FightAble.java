package com.day10.homework.test_one;

public interface FightAble {
    void specialFight();
    public default void commonFight(){
        System.out.println("普通打击");
    }
}
