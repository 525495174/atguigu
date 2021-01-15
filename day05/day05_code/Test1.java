import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int)(Math.random() * 99) + 1;
        }
        System.out.println("您的大乐透号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
