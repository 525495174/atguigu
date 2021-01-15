package com.day06.homework.test4;

public class Test04 {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(2021,1,15);

        if (myDate1.isLeapYear()){
            System.out.println(myDate1.year + "是闰年");
        }else {
            System.out.println(myDate1.year + "不是闰年");
        }

        myDate1.show();
        myDate1.set(1999,8,27);
        myDate1.show();

        myDate1.puls(1,1,2);
        myDate1.show();

    }
}
