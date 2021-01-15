package com.day06.homework.test3;

import com.day06.homework.test2.MyDate;

public class CitiZen {
    String name;
    MyDate birthday;
    String idnumber;

    public CitiZen(String name, MyDate birthday, String idnumber) {
        this.name = name;
        this.birthday = birthday;
        this.idnumber = idnumber;
    }
    public void show(){
        System.out.println("姓名:"+ name +"\n生日:" + birthday.show() +"\n身份证号:" + idnumber+"\n");
    }
}
