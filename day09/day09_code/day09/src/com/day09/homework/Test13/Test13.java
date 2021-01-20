package com.day09.homework.Test13;

public class Test13 {
    public static void main(String[] args) {
        final int EMPLOYEE = 10;//表示普通员工
        final int PROGRAMMER = 11;//表示程序员
        final int DESIGNER = 12;//表示设计师
        final int ARCHITECT = 13;//表示架构师

        String[][] EMPLOYEES = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐", "32", "18000", "15000", "2000"},
                {"11", "3", "我行", "23", "7000"},
                {"11", "4", "三丰", "24", "7300"},
                {"12", "5", "芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "无忌", "29", "10800","5200"},
                {"13", "8", "小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };

        Employee[] all = new Employee[EMPLOYEES.length];
        for (int i = 0; i < all.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            long number = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            long salary = Integer.parseInt(EMPLOYEES[i][4]);
            switch (type){
                case EMPLOYEE:
                    all[i] = new Employee(number,name,age,salary);
                    break;
                case PROGRAMMER:
                    all[i] = new Prorammer(number,name,age,salary);
                    break;
                case DESIGNER:
                    long bonus1 = Integer.parseInt(EMPLOYEES[i][5]);
                    all[i] = new Designer(number,name,age,salary,bonus1);
                    break;
                case ARCHITECT:
                    long bonus2 = Integer.parseInt(EMPLOYEES[i][5]);
                    int nums = Integer.parseInt(EMPLOYEES[i][6]);
                    all[i] = new Architect(number,name,age,salary,bonus2,nums);
                    break;
            }


        }
        System.out.println("编号\t\t姓名\t\t年龄\t\t薪资\t\t语言\t\t\t奖金\t\t\t股票");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
        }
    }
}
