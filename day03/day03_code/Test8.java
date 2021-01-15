import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {	
		boolean isFlag = true;
		boolean isSuccess = true;
		Scanner scan = new Scanner(System.in);
		do{
			isFlag = false;
			System.out.print("请输入总价格:");
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
				System.out.println("输入有误!!");
				isFlag= true;
			}
			if(totalPrice >= 0){
				System.out.println("总价:" + totalPrice);
				System.out.println("折扣:" + discount);
				System.out.println("折扣后总价:" + (totalPrice * discount));
			}
		}while(isFlag);
	}

}
