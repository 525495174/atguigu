package com.day09.homework.Test15;

public class Test15 {
    public static void meeting(Person... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man){
                Man man =(Man)ps[i];
                man.smoke();
            }else if (ps[i] instanceof Woman){
                Woman woman = (Woman)ps[i];
                woman.makeup();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();
        Man man4 = new Man();
        Man man3 = new Man();

        Woman woman1 = new Woman();
        Woman woman2 = new Woman();
        Woman woman3 = new Woman();

        meeting(man1,woman1,man2,man3,woman2,woman3,man4);
    }
}
