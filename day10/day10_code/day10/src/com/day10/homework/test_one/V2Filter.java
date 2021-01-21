package com.day10.homework.test_one;

public class V2Filter implements Filter{
    @Override
    public void filterUser(Customer c) {
        c.setLevel("v2");
    }
}
