public class Test14 {
    public static void main(String[] args) {
        String[][] poker = new String[2][];

        poker[0] = new String[4];
        poker[1] = new String[13];

        poker[0][0] = "黑桃";
        poker[0][1] = "红桃";
        poker[0][2] = "梅花";
        poker[0][3] = "方片";


        poker[1][0] = "A";
        for (int i = 1; i <= 9; i++) {
            poker[1][i] = i+1 +"";
        }
        poker[1][10] = "J";
        poker[1][11] = "Q";
        poker[1][12] = "K";

        for (int i = 0; i < poker[0].length; i++) {
            for (int j = 0; j < poker[1].length; j++) {
                System.out.print(poker[0][i] + poker[1][j] + " ");
            }
            System.out.println();
        }
    }
}
