import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1= new int[6];
        int[] arr2= new int[6];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("输入第1个数组第"+ (i+1)+"个数:");
            arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("输入第2个数组第"+ (i+1)+"个数:");
            arr2[i] = scan.nextInt();
        }
        boolean isTrue = false;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == arr2[i]){
                    isTrue = true;
                }else {
                    isTrue = false;
                }
            }
        }else{
            isTrue = false;
        }
        System.out.println("是否一致" + isTrue);
    }
}
