package com.day07.homework;

public class MyArrays {

    int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while(left <= right){
            if (arr[mid] == value){
                return mid;
            }else if (arr[mid] < value){
                left = mid + 1;
            }else if (arr[mid] > value){
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    int binarySearch(char[] arr,char value){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while (left <= right){
            if (arr[mid] ==  value){
                return mid;
            }else if (arr[mid] > value){
                right = mid - 1;
            }else if (arr[mid] < value){
                left = mid + 1;
            }
            mid = (left + right) /2;
        }
        return -1;
    }

    int[] copy(int[] arr,int length){
        int[] arrCopy = new int[length];
        int[] tempArry = (arrCopy.length < arr.length)?arrCopy:arr;
        for (int i = 0; i < tempArry.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }
    double[] copy(double[] arr,int length){
        double[] arrCopy = new double[length];
        double[] tempArry = (arrCopy.length < arr.length)?arrCopy:arr;
        for (int i = 0; i < tempArry.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }
    char[] copy(char[] arr,int length){
        char[] arrCopy = new char[length];
        char[] tempArry = (arrCopy.length < arr.length)?arrCopy:arr;
        for (int i = 0; i < tempArry.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }

    void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void sort(char[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void sort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void print(char[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }
    public void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }
    public void print(double[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                System.out.print(arr[i]);
            }else{
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }


}
class Test03 {

    public static void main(String[] args) {
        int[] arr = {3,4,2,7,1};
        char[] arr1 = {'3','4','2','7','1'};

        MyArrays my = new MyArrays();
        my.print(arr);
        System.out.println("1在数组中的下标：" + my.binarySearch(arr1, '1'));//结果错误，因为数组无序

        my.sort(arr1);
        my.print(arr1);
        System.out.println("1在数组中的下标：" + my.binarySearch(arr1, '1'));

        my.print(my.copy(arr1, 10));
    }

}