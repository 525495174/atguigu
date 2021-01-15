import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年:");
		int year = scan.nextInt();
		System.out.print("请输入月:");
		int month = scan.nextInt();
		System.out.print("请输入日:");
		int day = scan.nextInt();
		int days = 0;
		int[] arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
			arr[1] = 29;
		}

		for(int i = 0;i < month-1;i++){
			days += arr[i];
		}
		days += day;
		
		System.out.println(year + "年" + month + "月" + day + "日" + "是这一年的第" + days +"天");
	}

}
