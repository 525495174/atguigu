import java.util.Scanner;

public class Test{

	public static void main(String[] args) {

		for(int i = 2; i < 1000;i++){
                for(int j = 1;j < Math.sqrt(i);j++){
                    if(i % j == 0){
                        continue;
                    }else{
                        System.out.print(ÖÊÊý+" "+i);
                    }
                }

            }

	}

}
