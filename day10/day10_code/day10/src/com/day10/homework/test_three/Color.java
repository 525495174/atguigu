package com.day10.homework.test_three;

import com.day10.homework.test_one.CompareAble;

public enum Color {
    CHI("赤"),CHENG("橙"),HUANG("黄")
    ,LV("绿"),QING("青"),LAN("蓝"),ZHI("紫");
    private String info;

    private Color(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
