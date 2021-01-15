import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("��������:");
		int year = scan.nextInt();
		System.out.print("��������:");
		int month = scan.nextInt();
		System.out.print("��������:");
		int day = scan.nextInt();
		int days = 0;
			
		int[] arr = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		for(int i = 0;i < month-1;i++){
			days += arr[i];
		}
		days += day;
		
		for(int i = 2000;i < year;i++){
			if(isRun(i)){
				days += 366;
			}else{
				days +=365;
			}
		}

		if((days % 5) == 1 || (days % 5) == 2 || (days % 5) == 3){
			System.out.println("����");
		}else{
			System.out.print("ɹ��");
		}
	}




	public  static boolean isRun(int year){
		return year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
	}
}
