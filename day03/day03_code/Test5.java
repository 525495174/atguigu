
public class Test5 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		int  i =  0;
		while( i < 12 ){			
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.println();
	}

}
