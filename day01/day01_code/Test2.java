public class Test2 {

	public static void main(String[] args) {
		int[] arr1 = new int[]{-2147483648,-100,0,100,2147483647};
		double[] arr2 = new double[]{-100.0,-10.0,0.0,10.9,100.9};
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}

}
