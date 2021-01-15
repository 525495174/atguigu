import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÔÂ·Ý:");
		int month = scan.nextInt();
		System.out.println("ÇëÊäÈëÈÕÆÚ:");
		int day = scan.nextInt();
		String str1 = "";	
			if((month == 3 && day >=  21) || (month == 4 && day <= 19)){
				str1 = "°×Ñò×ù";
			}else if((month == 4 && day >=  20) || (month == 5 && day <= 20)){
				str1 = "½ðÅ£×ù";
			}else if((month == 5 && day >=  21) || (month == 4 && day <= 21)){
				str1 = "Ë«×Ó×ù";
			}else if((month == 6 && day >=  22) || (month == 7 && day <= 22)){
				str1 = "¾ÞÐ·×ù";
			}else if((month == 7 && day >=  23) || (month == 8 && day <= 22)){
				str1 = "Ê¨×Ó×ù";
			}else if((month == 8 && day >=  23) || (month == 9 && day <= 22)){
				str1 = "´¦Å®×ù";
			}else if((month == 9 && day >=  23) || (month == 10 && day <= 23)){
				str1 = "ÌìèÒ×ù";
			}else if((month == 10 && day >=  24) || (month == 11 && day <= 22)){
				str1 = "ÌìÐ«×ù";
			}else if((month == 11 && day >=  23) || (month == 12 && day <= 21)){
				str1 = "ÉäÊÖ×ù";
			}else if((month == 12 && day >=  22) || (month == 1 && day <= 19)){
				str1 = "Ä¦ôÉ×ù";
			}else if((month == 1 && day >=  20) || (month == 2 && day <= 18)){
				str1 = "Ë®Æ¿×ù";
			}else if((month == 2 && day >=  19) || (month == 3 && day <= 20)){
				str1 = "Ë«Óã×ù";
			}
			System.out.println("ÉúÈÕ" + month + "ÔÂ" + day + "ÈÕÊÇ" + str1  );
	}

}
