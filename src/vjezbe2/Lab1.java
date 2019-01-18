package vjezbe2;

public class Lab1 {

	public static void main(String[] args) {
	
	System.out.println(sum(5));
	System.out.println(fact(6));

	}
	public static int sum(int n) {
		
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			sum = sum + i;
			System.out.println("Sum is "  + i + " " + sum);
		}
		return sum; 
	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1; 
		}
		System.out.println(n);
		return fact(n-1)*n; 
	}

}
