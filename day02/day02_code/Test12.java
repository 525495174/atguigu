import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�������·�:");
		int month = scan.nextInt();
		System.out.print("����������:");
		int day = scan.nextInt();

		int sum = 0;

		switch (month){
		case 12:
			sum +=31;
		case 11:
			sum +=31;
		case 10:
			sum +=30;
		case 9:
			sum +=31;
		case 8:
			sum +=31;
		case 7:
			sum +=30;
		case 6:
			sum +=31;
		case 5:
			sum +=30;
		case 4:
			sum +=31;
		case 3:
			sum +=28;
		case 2:
			sum +=31;
		case 1:
			sum +=day;
			break;
		}
		int week = 2;
		week += sum - 1;
		int date = week % 7;
		String str = "";
		switch (date){
		case 1:
			str = "����һ";
			break;
		case 2:
			str = "���ڶ�";
			break;
		case 3:
			str = "������";
			break;
		case 4:
			str = "������";
			break;
		case 5:
			str = "������";
			break;
		case 6:
			str = "������";
			break;
		case 0:
			str = "������";
			break;
		}
		System.out.println(month + "��" + day + "����" + str);

	}

}
