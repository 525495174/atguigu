package com.day10.homework.test_one;

public class AFilter implements Filter {
    @Override
    public void filterUser(Customer c) {
        c.setLevel("A");
    }
}
