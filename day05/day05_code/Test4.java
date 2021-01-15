import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        char[] ch1 = new char[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ch1.length; i++) {
            System.out.print("输入第"+ (i+1)+"个字符:");
            ch1[i] = scan.next().charAt(0);
        }
        int[] arr = new int[26];
        for (int i = 0; i <ch1.length; i++) {
           arr[(int)(ch1[i] - 97)] +=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.println((char)(i+97) + "--" + arr[i]);
            }
        }
    }
}
