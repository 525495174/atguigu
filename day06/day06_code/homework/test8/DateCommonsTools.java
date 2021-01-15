package com.day06.homework.test8;

public class DateCommonsTools {
    //：根据星期值，返回对应的英语单词Tuesday,
    // Wednesday, Thursday, Friday, Saturday,
    String getWeekName(int week) {
        switch (week) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";
            default:
                return "没有这个星期";

        }
    }

    //：根据月份值，返回对应的英语单词
    String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March.";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";
            case 8:
                return "July";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "没有这个月份";

        }
    }

    //：返回某年某月的总天数
    int getTotalDaysOfMonth(int year, int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 11:
                return 30;
            case 2:
                if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0){
                    return 29;
                }else {
                    return 28;
                }
            default:
                return -666;
        }

    }

    //：获取某年的总天数
    int getTotalDaysOfYear(int year) {
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0){
            return 366;
        }else {
            return 365;
        }
    }

    //：判断某年是否是闰年
    boolean isLeapYear(int year) {
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else {
            return false;
        }
    }


}
