
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		System.out.print("请输入一个四位数：");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int qian = number / 1000;
		int bai = number / 100 % 10;
		int shi = number / 10 % 10;
		int ge = number % 10;
		
		System.out.println("千位上是" + qian);
		System.out.println("百位上是" + bai);
		System.out.println("十位上是" + shi);
		System.out.println("个位上是" + ge);
	}

}
