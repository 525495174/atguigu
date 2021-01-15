package com.day06.homework.test7;

public class MyArrays {
    //：可以为任意一维整型数组arr实现从小到大排序
    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    //：可以在任意一维整型数组arr中查找value值的下标，如果不存在返回-1
    int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //：可以实现从任意一维数组arr中复制一个新数组返回，新数组的长度为len，从arr[0]开始复制
    int[] copy(int[] arr, int len) {
        int[] newArr = new int[len];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }

}
