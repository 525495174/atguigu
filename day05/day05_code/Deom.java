import java.util.Scanner;

public class Deom {
    public static void main(String[] args) {
        ToolClass  choose = new ToolClass();
        choose.MainMenu();

    }
}

class ToolClass {

    int teamNums;
    int[][] team;

    public void MainMenu() {
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("--------------菜单--------------");
            System.out.println("\t1.输入成绩:");
            System.out.println("\t2.查看组情况:");
            System.out.println("\t3.查看全班情况:");
            System.out.println("--------------------------------\n");
            System.out.print("请输入序号(#键退出):");
            char key = scan.next().charAt(0);
            switch (key) {

                case '1':
                    AddScore();
                    break;
                case '2':
                    ShowGroups();
                    break;
                case '3':
                    ShowClass();
                    break;
                case '#':

                    isFlag = false;
            }

        }
    }
    public void AddScore(){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一共有多少组:");
        teamNums = scan.nextInt();
        team = new int[teamNums][];

        for (int i = 0; i < team.length; i++) {
            System.out.print("请输入第" + (i + 1) + "组有多少人:");
            team[i] = new int[scan.nextInt()];
            for (int j = 0; j < team[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "组第" + (j + 1) + "个同学的成绩:");
                team[i][j] = scan.nextInt();
            }
        }
        System.out.println("------------添加完成-----------\n");
    }
    public void ShowGroups(){
        System.out.print("选择你想查看的组:");
        Scanner scan = new Scanner(System.in);
        ShowGroup(scan.nextInt() - 1);

    }
    private void ShowGroup(int i){
        System.out.println("第" + (i+1) + "组最高分为" +maxScores(team,i) );
        System.out.println("第" + (i+1) + "组最高分为" +minScores(team,i) );
        System.out.println("第" + (i+1) + "组总分为" +sumScores(team,i) );
        System.out.println("第" + (i+1) + "组平均分为" +avgScores(team,i) );
        System.out.println("-------------------------------\n");
    }
    private int maxScores(int[][] temp,int l){
        int[] maxScores = new int[teamNums];
        for (int i = 0; i <temp.length ; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (team[i][j] > maxScores[i]){
                    maxScores[i] = team[i][j];
                }
            }
        }
        return maxScores[l];
    }
    private int minScores(int[][] temp,int l){
        int[] minScores = new int[teamNums];
        for (int i = 0; i < minScores.length; i++) {
            minScores[i] = temp[i][0];
        }
        for (int i = 0; i <temp.length ; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (team[i][j] < minScores[i]){
                    minScores[i] = team[i][j];
                }
            }
        }
        return minScores[l];
    }
    private int sumScores(int[][] temp,int l){
        int[] sumScores = new int[teamNums];
        for (int i = 0; i <temp.length ; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                sumScores[i] += team[i][j];
            }
        }
        return sumScores[l];
    }
    private int avgScores(int[][] temp,int l){
        int[] avgScores = new int[teamNums];
        for (int i = 0; i <temp.length ; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                avgScores[i] = sumScores(temp,l) / team[i].length;
            }
        }
        return avgScores[l];
    }
    public void ShowClass(){
        System.out.println("全班情况");
    }

}

