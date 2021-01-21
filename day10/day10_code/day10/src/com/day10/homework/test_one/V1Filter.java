package com.day10.homework.test_one;

public class V1Filter implements Filter {
    @Override
    public void filterUser(Customer c) {
        c.setLevel("v1");
    }
}
