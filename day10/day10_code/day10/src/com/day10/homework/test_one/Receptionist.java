package com.day10.homework.test_one;

public class Receptionist {
    private Filter filter;

    public Receptionist() {
    }

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void setLevel(Customer c,Filter filter){
        filter.filterUser(c);
    }
}
