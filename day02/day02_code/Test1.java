/*
�������һ��100���ڵ�������������Ϸ

�Ӽ��������������������ʾ�����ˣ����С�ˣ���ʾС�ˣ�������ˣ��Ͳ��ٲ��ˣ���ͳ��һ�����˶��ٴ�

��ʾ�������  Math.random()
*/
import java.util.Scanner;
public class Test1{

	public static void main(String[] args) {
		
		//�Ӽ���������
		System.out.print("��������µ���(1-100):");
		//�������һ��100���ڵ���
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number = (int)(Math.random() * 101);
		int sum = 0;
		//���������ʾ�����ˣ����С�ˣ���ʾС��
		do{
			sum++;
			if(num > number){
				System.out.print("����,����������һ����:" );
				num = scan.nextInt();
			}else if(num < number){
				System.out.print("С��,����������һ����:");
				num = scan.nextInt();
			}
		}while(!(num == number));
		System.out.println("�¶���!һ������" + sum + "��");
	}

}
