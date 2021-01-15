import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("输入第"+ (i+1)+"个分数:");
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int count = 0;
        double avg = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg){
                count++;
            }
        }
        System.out.println("高于平均分:" + avg + "的个数有" + count + "个");
    }
}
