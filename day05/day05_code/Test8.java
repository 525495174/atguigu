public class Test8 {
    public static void main(String[] args) {
        char[] biao = new char[]{'A','D','B','C','D'};
        char[] shang = new char[]{'D','C','B','A','D'};
        char[] gui = new char[]{'A','D','B','C','D'};
        char[] gu = new char[]{'A','D','B','C','A'};
        char[] hao = new char[]{'A','B','C','D','D'};
        int shangNum = 0;
        for (int i = 0; i < shang.length; i++) {
            if (shang[i] == biao[i]){
                shangNum+=2;
            }
        }
        System.out.println("满分10分,小尚:得分:" + shangNum +"分");

        int guiNum = 0;
        for (int i = 0; i < gui.length; i++) {
            if (gui[i] == biao[i]){
                guiNum+=2;
            }
        }
        System.out.println("满分10分,小贵:得分:" + guiNum +"分");

        int guNum = 0;
        for (int i = 0; i < gu.length; i++) {
            if (gu[i] == biao[i]){
                guNum+=2;
            }
        }
        System.out.println("满分10分,小古:得分:" + guNum +"分");

        int haoNum = 0;
        for (int i = 0; i < hao.length; i++) {
            if (hao[i] == biao[i]){
                haoNum+=2;
            }
        }
        System.out.println("满分10分,小好:得分:" + haoNum +"分");
    }
}
