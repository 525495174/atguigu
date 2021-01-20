package com.day09.test;

public abstract class Employee {
    private String name ;


    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //用于返回实发工资
    public abstract double earning();

    //显示姓名和实发工资
    public String getInfo(){
        return "员工姓名:" + name + "\t实发工资:" + earning() ;
    }

}
