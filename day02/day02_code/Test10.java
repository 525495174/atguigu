import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("������һ�����:");
		int year = scan.nextInt();
		String str = "";
		switch (year % 12){
		case 1:
			str = "����";
			break;
		case 2:
			str = "����";
			break;
		case 3:
			str = "����";
			break;
		case 4:
			str = "����";
			break;
		case 5:
			str = "ţ��";
			break;
		case 6:
			str = "����";
			break;
		case 7:
			str = "����";
			break;
		case 8:
			str = "����";
			break;
		case 9:
			str = "����";
			break;
		case 10:
			str = "����";
			break;
		case 11:
			str = "����";
			break;
		case 0:
			str = "����";
			break;
		}
		System.out.println(year + "��" + str);

	}

}
