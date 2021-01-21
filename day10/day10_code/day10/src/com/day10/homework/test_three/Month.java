package com.day10.homework.test_three;

public enum Month {
    JANUARY(1,"1月份是一年的开始")
    ,FEBRUARY(2,"2月份是一年的第二个月")
    ,MARCH(3,"3月份是一年的第三个月")
    ,APRIL(4,"4月份是一年的第四个月")
    ,MAY(5,"5月份是一年的第五个月")
    ,JUNE(6,"6月份是一年的第六个月")
    ,JULY(7,"7月份是一年的第七个月")
    ,AUGUST(8,"8月份是一年的第八个月")
    ,SEPTEMBER(9,"9月份是一年的第九个月")
    ,OCTOBER(10,"10月份是一年的第十个月")
    ,NOVEMBER(11,"11月份是一年的倒数第二个月")
    ,DECEMBER(12,"12月份是一年的最后一个");

    private int value;
    private String description;

    private Month(int value,String description){
        this.value = value;
        this.description = description;
    }

    public static Month getByValue(int value){
        switch (value){
            case 1:
                return JANUARY;
            case 2:
                return FEBRUARY;
            case 3:
                return MARCH;
            case 4:
                return APRIL;
            case 5:
                return MAY;
            case 6:
                return JUNE;
            case 7:
                return JULY;
            case 8:
                return AUGUST;
            case 9:
                return SEPTEMBER;
            case 10:
                return OCTOBER;
            case 11:
                return NOVEMBER;
            case 12:
                return DECEMBER;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return value + "->" + name() + description;
    }
}
