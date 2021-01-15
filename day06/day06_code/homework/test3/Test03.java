package com.day06.homework.test3;

import com.day06.homework.test2.MyDate;

public class Test03 {
    public static void main(String[] args) {
        MyDate sisterBirthday = new MyDate(1990,11,27);
        CitiZen sister = new CitiZen("陈欢",sisterBirthday,"43534543534534535345");

        MyDate myBirthday = new MyDate(2000,8,27);
        CitiZen mine = new CitiZen("陈龙",myBirthday,"43534543534534535345");

        MyDate birthday = new MyDate(2010,3,21);
        CitiZen lihuae = new CitiZen("李华",birthday,"43534543534534535345");

        MyDate birthday1 = new MyDate(1999,4,7);
        CitiZen xiaomin = new CitiZen("小明",birthday1,"43534543534534535345");

        sister.show();
        mine.show();
        lihuae.show();
        xiaomin.show();
    }
}
