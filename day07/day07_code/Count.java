package com.day07.homework.eneity;

public class Count {

    public long sum(int... nums){
        long sum = 0;
        for (int i :nums) {
            sum += i;
        }
        return sum;
    }

    public int max(int a ,int... others){
        int max = a;
        for (int i:others) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public String concat(String... strings){
        String arr = "";
        for (String str:strings) {
            arr += str;
        }
        return arr;
    }

    public boolean isEven(int... nums){
        boolean isTrue = false;
        for (int i :
                nums) {
            if (i % 2 == 0){
                isTrue = true;
            }else {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}

class Test01 {
    public static void main(String[] args) {
        Count count = new Count();

        System.out.println("无参数累加" + count.sum());
        System.out.println("1,2,3,4,5,6,7,8,9,10累加" + count.sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println();
        System.out.println("无参数求最大值(a为" + 0 +")" + count.max(0));
        System.out.println("1,2,3,4,5,6,7,8,9,10最大值(a为" + 0 +")" + count.max(0,1,2,3,4,5,6,7,8,9,10));
        System.out.println();
        System.out.println("无字符串拼接:" + count.concat());
        System.out.println("\"我\" \"就\" \"是\" \"我\" \",\" \"是\" \"不\" \"一\" \"样\" \"的\" \"烟\" \"火\" \"!\" 字符串拼接" + count.concat("我","就","是","我",",","是","不","一","样","的","烟","火","!"));
        System.out.println();
        System.out.println("2,4,2,4,6,3,4,6判断是否为偶数:"+ count.isEven(2,4,2,4,6,3,4,6));
        System.out.println("2,4,6,8,10,200,204判断是否为偶数:"+ count.isEven(2,4,6,8,10,200,204));
    }
}
