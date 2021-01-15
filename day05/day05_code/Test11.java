import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个单词:");
        String word = scan.next();
        char[] arr = word.toCharArray();
        boolean isTrue = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a'){
                isTrue = true;
                break;
            }else {
                isTrue = false;
            }
        }
        System.out.println("这个单词中是否有'a'字母 " + isTrue);
    }
}
