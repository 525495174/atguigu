import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�������·�:");
		int month = scan.nextInt();
		System.out.println("����������:");
		int day = scan.nextInt();
		String str1 = "";	
			if((month == 3 && day >=  21) || (month == 4 && day <= 19)){
				str1 = "������";
			}else if((month == 4 && day >=  20) || (month == 5 && day <= 20)){
				str1 = "��ţ��";
			}else if((month == 5 && day >=  21) || (month == 4 && day <= 21)){
				str1 = "˫����";
			}else if((month == 6 && day >=  22) || (month == 7 && day <= 22)){
				str1 = "��з��";
			}else if((month == 7 && day >=  23) || (month == 8 && day <= 22)){
				str1 = "ʨ����";
			}else if((month == 8 && day >=  23) || (month == 9 && day <= 22)){
				str1 = "��Ů��";
			}else if((month == 9 && day >=  23) || (month == 10 && day <= 23)){
				str1 = "������";
			}else if((month == 10 && day >=  24) || (month == 11 && day <= 22)){
				str1 = "��Ы��";
			}else if((month == 11 && day >=  23) || (month == 12 && day <= 21)){
				str1 = "������";
			}else if((month == 12 && day >=  22) || (month == 1 && day <= 19)){
				str1 = "Ħ����";
			}else if((month == 1 && day >=  20) || (month == 2 && day <= 18)){
				str1 = "ˮƿ��";
			}else if((month == 2 && day >=  19) || (month == 3 && day <= 20)){
				str1 = "˫����";
			}
			System.out.println("����" + month + "��" + day + "����" + str1  );
	}

}
