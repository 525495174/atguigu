import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		char ch = '#';
		System.out.print(ch + 1);
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ����:");
		int number = scan.nextInt();
		if(number % 2 == 0){
			System.out.println(number + "��ż��");
		}else{
			System.out.println(number + "������");
		}
	}

}
