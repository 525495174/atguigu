public class Test2_1 {
    public static void main(String[] args) {

        String[][] pai = new String[4][13];
        String[] hua = new String[]{"黑桃","红桃","梅花","方片"};
        String[] dian = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(int i = 0; i < pai.length;i++){
            for(int j = 0;j < pai[i].length;j++){
                pai[i][j] = hua[i] + dian[j];
            }
        }

        for(int i = 0; i < pai.length;i++){
            for(int j = 0;j < pai[i].length;j++){
                if (j == pai[i].length - 1) {
                    System.out.println(pai[i][j] + "\n");
                }else{
                    System.out.print(pai[i][j] + " ");
                }
            }
        }

    }
}
