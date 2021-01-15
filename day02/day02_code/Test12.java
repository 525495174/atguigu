import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入月份:");
		int month = scan.nextInt();
		System.out.print("请输入日期:");
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
			str = "星期一";
			break;
		case 2:
			str = "星期二";
			break;
		case 3:
			str = "星期三";
			break;
		case 4:
			str = "星期四";
			break;
		case 5:
			str = "星期五";
			break;
		case 6:
			str = "星期六";
			break;
		case 0:
			str = "星期天";
			break;
		}
		System.out.println(month + "月" + day + "日是" + str);

	}

}
