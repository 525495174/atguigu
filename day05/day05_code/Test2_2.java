public class Test2_2 {
    public static void main(String[] args) {
        String[][] pokers = new String[2][];
        pokers[0] = new String[4];
        pokers[1] = new String[13];

        pokers[0][0] = "黑桃";
        pokers[0][1] = "红桃";
        pokers[0][2] = "梅花";
        pokers[0][3] = "方片";

        pokers[1][0] = "A";
        for (int i = 1,k=2; i <= 10 ; i++) {
            pokers[1][i] = k++ + "";
        }
        pokers[1][10] = "J";
        pokers[1][11] = "Q";
        pokers[1][12] = "K";

        for (int i = 0; i < pokers[0].length; i++) {
            for (int j = 0; j < pokers[1].length; j++) {
                System.out.print(pokers[0][i] + pokers[1][j] + " ");
            }
            System.out.println();
        }



    }
}
