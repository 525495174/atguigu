
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		System.out.print("������һ����λ����");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int qian = number / 1000;
		int bai = number / 100 % 10;
		int shi = number / 10 % 10;
		int ge = number % 10;
		
		System.out.println("ǧλ����" + qian);
		System.out.println("��λ����" + bai);
		System.out.println("ʮλ����" + shi);
		System.out.println("��λ����" + ge);
	}

}
