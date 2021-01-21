package com.day10.homework.test_one;

public class Player {
    public static  FightAble Select(String str){
        if(str.equals("法力角色")){
            return new Mage();
        }else if (str.equals("武力角色")){
            return new Zhanshi();
        }else{
            return null;
        }

    }
}
