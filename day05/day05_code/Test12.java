public class Test12 {
    public static void main(String[] args) {
        int[] arr = new int[62];
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i <= 9) {
                for (int j = 0,k = 48; j <= 9; j++) {
                    arr[j] = k++;
                }
            }else if (i <= 35) {
                for (int j = 10, k = 97; j <= 35; j++) {
                    arr[j] = k++;
                }
            } else {
                for (int j = 36, k = 65; j <= 61; j++) {
                    arr[j] = k++;
                }
            }
        }
        int num = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("随机验证码:");
            for (int j = 0; j < 6; j++) {
                num = (int)(Math.random()*62);
                System.out.print((char)(arr[num]));
            }
            System.out.println();
        }
    }
}
