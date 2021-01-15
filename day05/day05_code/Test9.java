import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入小组人数:");
        int num = scan.nextInt();
        int[] score = new int[num];
        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第"+ (i+1) +"位组员成绩:");
            score[i] = scan.nextInt();
        }
        for (int i = 0; i < score.length -1; i++) {
            for (int j = 0; j < score.length -1-i; j++) {
                if (score[j] > score[j+1]){
                    int temp = score[j];
                    score[j] = score [j+1];
                    score[j+1] = temp;
                }
            }
        }

        for (int i = score.length -1; i >= 0; i--) {
            System.out.println(score[i] + " ");
        }
    }
}
