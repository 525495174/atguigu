
public class Test4 {

	public static void main(String[] args) {

		
		//test1
		/*
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum += i;
		}
		System.out.println(sum);
		*/

		
		//test2
		/*
		int i = 1;
		while(i <= 100){
			if(i % 3 == 0 && i % 7 == 0){
				System.out.println(i);
			}
			i++;
		}
		*/
		
		//test3
		int i = 100;
		while(i <= 999){
			int ge = i % 10;
			int shi = i % 100 / 10;
			int bai = i / 100;
			if(Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3) == i){
				System.out.println(i);
			}
			i++;
		}

		for (int x = 0; x < 5; x++) {
			for (int j = 0; j < (5 - x); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
