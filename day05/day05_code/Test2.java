import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) {

        String[] hua = new String[]{"黑桃","红桃","梅花","方片"};
        String[] dian = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] pai = new String[52];

        int number = 0;
        for (int i = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++) {
                pai[number++] = hua[i] + dian[j];
            }
        }
        for (int i = 0; i < pai.length; i++) {
            if ((i + 1) % 13 == 0) {
                System.out.println(pai[i] + "\n");
            }else{
                System.out.print(pai[i] + " ");
            }
        }

    }
}
