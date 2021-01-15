/*
随机生成一个100以内的数，猜数字游戏

从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次

提示：随机数  Math.random()
*/
import java.util.Scanner;
public class Test1{

	public static void main(String[] args) {
		
		//从键盘输入数
		System.out.print("请输入你猜的数(1-100):");
		//随机生成一个100以内的数
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number = (int)(Math.random() * 101);
		int sum = 0;
		//如果大了提示，大了，如果小了，提示小了
		do{
			sum++;
			if(num > number){
				System.out.print("大了,请重新输入一个数:" );
				num = scan.nextInt();
			}else if(num < number){
				System.out.print("小了,请重新输入一个数:");
				num = scan.nextInt();
			}
		}while(!(num == number));
		System.out.println("猜对啦!一共猜了" + sum + "次");
	}

}
