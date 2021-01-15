import java.sql.SQLOutput;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一共有多少组:");
        int teamNums = scan.nextInt();
        int[][] team = new int[teamNums][];

        for (int i = 0; i < team.length; i++) {
            System.out.print("请输入第" + (i+1) +"组有多少人:");
            team[i] = new int[scan.nextInt()];
            for (int j = 0; j < team[i].length; j++) {
                System.out.print("请输入第" + (i+1) +"组第" + (j+1) + "个同学的成绩:");
                team[i][j] = scan.nextInt();
            }
        }
        System.out.println("----------------成绩单--------------");
        for (int i = 0; i <team.length; i++) {
            System.out.print("第"+ (i+1) +"组成绩:");
            for (int j = 0; j < team[i].length; j++) {
                System.out.print(team[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        int[] maxScores = new int[teamNums];//每组最高分
        int[] minScores = new int[teamNums];//每组最低分
        int[] sumScores = new int[teamNums];//每组总分
        double[] avgScores = new double[teamNums];//每组平均分
        int maxAll = -1;//全班最高分
        int minAll = 101;//全班最低分
        int sumAll = 0;
        double avgAll = 0;//全班平均分
        int sumCount = 0;//全班总人数

        for (int i = 0; i < minScores.length; i++) {
            minScores[i] = team[i][0];

        }
        for (int i = 0; i < team.length; i++) {


            for (int j = 0; j < team[i].length; j++) {

                //每组最高分/最低分
                if (team[i][j] > maxScores[i]){
                    maxScores[i] = team[i][j];
                }
                if (team[i][j] < minScores[i]){
                    minScores[i] = team[i][j];
                }


                //每组总分/平均分
                sumScores[i] += team[i][j];

                //全班最高分/最低分
                if (team[i][j] > maxAll){
                    maxAll = team[i][j];
                }
                if (team[i][j] < minAll){
                    minAll = team[i][j];
                }

                sumAll += team[i][j];
                sumCount++;
            }

            //全班平均分/每组平均分
            for (int j = 0; j < team[i].length; j++) {
                avgScores[i] = sumScores[i] / team[i].length;
                avgAll = sumAll / sumCount;
            }

        }

        for (int i = 0; i < maxScores.length; i++) {
            System.out.println("第" + (i+1) + "组最高分为" + maxScores[i]);
        }
        for (int i = 0; i < minScores.length; i++) {
            System.out.println("第" + (i+1) + "组最低分为" + minScores[i]);
        }
        for (int i = 0; i < avgScores.length; i++) {
            System.out.println("第" + (i+1) + "组平均分为" + avgScores[i]);
        }
        for (int i = 0; i < sumScores.length; i++) {
            System.out.println("第" + (i+1) + "组总分为" + sumScores[i]);
        }
        System.out.println("全班最高分:" + maxAll + ",全班最低分:" + minAll + ",全班平均分:" + avgAll +"全班总人数:" + sumCount);

    }
}
