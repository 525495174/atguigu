import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入a的值:");
		double a = scan.nextDouble();
		System.out.print("请输入b的值:");
		double b = scan.nextDouble();
		System.out.print("请输入c的值:");
		double c = scan.nextDouble();
		double x1 = 0;
		double x2 = 0;
		if(a != 0){
			double temp = b*b - 4*a*c;
			if(temp > 0){
				x1 = (Math.sqrt(temp) - b) / 2*a;
				x2 = (-b-Math.sqrt(temp)) / 2*a;
			}else if(temp ==  0){
				x1 = x2 = -b / 2*a;
			}else{
				System.out.println("无解");
			}
			
		}else if(b != 0){
			x1 = x2 = (-c) / b;
		}else{
			System.out.println("解不出来");
		}
		if (x1 != 0 || x2 != 0){
			System.out.println("方程的两个解为:\tx1 = " +  x1 + "\n\t\tx2 = " + x2);
		}
		

	}

}
