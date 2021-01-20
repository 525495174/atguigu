package com.day09.homework.Test13;

public class Prorammer extends Employee {
    private String language = "Java";

    public Prorammer() {
    }

    public Prorammer(long number, String name, int age, long salary) {
        super(number, name, age, salary);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\t" + language;
    }
}
