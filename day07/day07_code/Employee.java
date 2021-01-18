package com.day07.homework;

public class Employee {
    int id;
    String name;
    double salary;
    int age;

    void printInfo(){
        System.out.println("id:"+ id + "\t\tname:" + name + "\t\tsalary:" + salary + "\t\tage:" + age);
    }
    void setInfo(int i,String n,double s,int a){
        this.age = a;
        this.id = i;
        this.name = n;
        this.salary = s;
    }
}
 class EmployeeManager{
    public void print(Employee[] all){
        for (int i = 0; i < all.length; i++) {
            all[i].printInfo();
        }
    }
    public void sort(Employee[] all){
        Employee tempEmplyee = new Employee();
        for (int i = 0; i < all.length-1; i++) {
            for (int j = 0; j < all.length-1-i; j++) {
                if (all[j].age > all[j+1].age){
                    tempEmplyee = all[j];
                    all[j] = all[j+1];
                    all[j+1] = tempEmplyee;
                }
            }
        }
    }
    public void addSalary(Employee[] all,double increament){
        for (int i = 0; i < all.length; i++) {
             all[i].salary += increament;
        }
    }
 }
class Test05 {
    public static void main(String[] args){
        Employee[] all = new Employee[5];
        all[0] = new Employee();
        all[0].setInfo(1,"张三",10000,18);

        all[1] = new Employee();
        all[1].setInfo(2,"李四",12000,20);

        all[2] = new Employee();
        all[2].setInfo(3,"王五",8000,19);

        all[3] = new Employee();
        all[3].setInfo(4,"赵六",6000,20);

        all[4] = new Employee();
        all[4].setInfo(5,"钱七",15000,22);

        EmployeeManager em = new EmployeeManager();

        em.print(all);
        System.out.println("------------------------------------------");

        em.sort(all);
        em.print(all);
        System.out.println("------------------------------------------");

        em.addSalary(all, 1000);
        em.print(all);
    }
}