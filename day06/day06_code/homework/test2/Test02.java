package com.day06.homework.test2;

public class Test02 {
    public static void main(String[] args) {

        MyDate myDate1 = new MyDate(1999,8,27);
        MyDate myDate2 = new MyDate(2021,1,7);
        MyDate myDate3 = new MyDate(2021,7,1);

        System.out.println("出生日期:"+myDate1.show());
        System.out.println("来尚硅谷的日期:"+myDate2.show());
        System.out.println("毕业日期:" + myDate2.show());
    }
}
