import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {	
		boolean isFlag = true;
		boolean isSuccess = true;
		Scanner scan = new Scanner(System.in);
		do{
			isFlag = false;
			System.out.print("�������ܼ۸�:");
			int totalPrice = scan.nextInt();
			double discount = 1;
			if(totalPrice >= 500){
				discount = 0.5;
			}else if(totalPrice >= 400){
				discount = 0.6;
			}else if(totalPrice >= 300){
				discount = 0.7;
			}else if(totalPrice >= 200){
				discount = 0.8;
			}else if(totalPrice >= 0){
				discount = 1;
			}else{
				System.out.println("��������!!");
				isFlag= true;
			}
			if(totalPrice >= 0){
				System.out.println("�ܼ�:" + totalPrice);
				System.out.println("�ۿ�:" + discount);
				System.out.println("�ۿۺ��ܼ�:" + (totalPrice * discount));
			}
		}while(isFlag);
	}

}
