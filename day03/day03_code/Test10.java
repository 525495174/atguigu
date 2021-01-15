import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个年份:");
		int year = scan.nextInt();
		String str = "";
		switch (year % 12){
		case 1:
			str = "鸡年";
			break;
		case 2:
			str = "狗年";
			break;
		case 3:
			str = "猪年";
			break;
		case 4:
			str = "鼠年";
			break;
		case 5:
			str = "牛年";
			break;
		case 6:
			str = "虎年";
			break;
		case 7:
			str = "兔年";
			break;
		case 8:
			str = "龙年";
			break;
		case 9:
			str = "蛇年";
			break;
		case 10:
			str = "马年";
			break;
		case 11:
			str = "羊年";
			break;
		case 0:
			str = "猴年";
			break;
		}
		System.out.println(year + "是" + str);

	}

}
