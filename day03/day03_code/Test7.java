import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isFlag = true;
		
		while(isFlag){
			System.out.print("������һ���ַ�(���ַ�Χ0-9,����#�˳�):");
			String str1 = scan.next();
			char ch1 = str1.charAt(0);

			if((ch1 > 65 && ch1 < 91) || (ch1 > 97 && ch1 < 123)){
				System.out.println(ch1 + "��һ����ĸ");
			}else if(ch1 > 49 && ch1 < 58){
				System.out.println(ch1 + "��һ������");
			}else if(ch1 == '#'){
				isFlag = false;
			}else{
				System.out.println(ch1 + "��һ������ĸ�����ֵ������ַ�");
			}
		}

	}

}
