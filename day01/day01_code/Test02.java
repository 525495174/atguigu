public class Test02 {

	public static void main(String[] args) {

	/*
		int i = 1;
		int j = i++;
		int k = i++ * ++j + ++i * j++;
		
		System.out.println("i = " + i);//4
		System.out.println("j = " + j);//3
		System.out.println("k = " + k);//12
		
		int i = 1;
		int j = i++;
		int k = i++ * ++j + --i * j--;
		
		System.out.println("i = " + i);//2
		System.out.println("j = " + j);//1
		System.out.println("k = " + k);//8
		
		int i = 1;
		int j = ++i + i++ * ++i + i++;
		
		System.out.println("i = " + i);//5
		System.out.println("j = " + j);//14
		*/
		int i = 0;
		int result = ++i/--i;
		System.out.println("result="+result);
	}

}
