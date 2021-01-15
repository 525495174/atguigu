import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        String[] hua = new String[]{"黑桃", "红桃", "梅花", "方片"};
        String[] dian = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pai = new String[52];

        int number = 0;
        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++) {
                pai[number++] = hua[i] + dian[j];
            }
        }

        boolean isFlag = true;
        int num;
        Scanner scan = new Scanner(System.in);
        while(isFlag){
            System.out.print("请输入你要抽取牌的序号(输入666退出):");
            num = scan.nextInt();
            if(num == 666){
                isFlag = false;
                break;
            }else{
                System.out.println("你抽到的牌是:" + pai[num - 1]);
            }

        }
    }
}
