import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���������(0-100):");
		int score = scan.nextInt();
		switch(score / 10){
		case 10:
		case 9:	 
			System.out.println("����");
			break;
		case 8:		  	 
			System.out.println("����");
			break;
		case 7:	
		case 6:		 
			System.out.println("����");
			break; 
		default:
			System.out.println("������");
			break;
		};


	}

}
