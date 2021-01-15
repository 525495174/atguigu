import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isFlag = true;
		
		while(isFlag){
			System.out.print("请输入一个字符(数字范围0-9,输入#退出):");
			String str1 = scan.next();
			char ch1 = str1.charAt(0);

			if((ch1 > 65 && ch1 < 91) || (ch1 > 97 && ch1 < 123)){
				System.out.println(ch1 + "是一个字母");
			}else if(ch1 > 49 && ch1 < 58){
				System.out.println(ch1 + "是一个数字");
			}else if(ch1 == '#'){
				isFlag = false;
			}else{
				System.out.println(ch1 + "是一个非字母非数字的其他字符");
			}
		}

	}

}
