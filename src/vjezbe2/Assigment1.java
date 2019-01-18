package vjezbe2;

public class Assigment1 {

	public static void main(String[] args) {
		
		System.out.println(sum(5));
		System.out.println(zbroj(4));
		System.out.println("Factorial: " + fact(5));
		
		int[] numbers = {5, -2, 0, -7, 200}; 
		System.out.println("Min:" + findMin(numbers));
		System.out.println("Max:" + findMax(numbers));
		System.out.println("Avg:" + findAvg(numbers));
}
	public static int findAvg(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length; 
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++ ) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min; 
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++ ) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max; 
	}
	public static int sum(int n) {
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			sum = sum + i;
			System.out.println(i + " " + sum);
		}
		return sum; 
	}
	public static int zbroj(int a) {
		int zbroj = 0;
		for (int u = 2; u < a; u++) {
			zbroj = zbroj + u; 
			
			System.out.println("zbroj je " + u + " " + zbroj);
		}
			return zbroj; 
	}
	
	public static int fact(int b) {
		if (b == 0) {
			return 1;
		}
		System.out.println(b);
		return fact(b-1) * b;
	}
}
