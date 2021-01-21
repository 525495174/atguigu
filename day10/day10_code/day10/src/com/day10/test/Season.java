package com.day10.test;

public enum Season {
    SPRING("春"),SUMMER("夏"),AUTUMN("秋"),WINTER("冬");

    private String info;

    private Season(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
