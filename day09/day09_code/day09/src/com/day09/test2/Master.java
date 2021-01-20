package com.day09.test2;

public class Master {
    public void showInfo(Person person){
        person.eat();
        person.walk();
        if (person instanceof Man){
            Man man = (Man)person;
            man.smoke();
        }else if (person instanceof Woman){
            Woman woman = (Woman)person;
            woman.buy();
        }
    }
}