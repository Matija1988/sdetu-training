package algorithms;

public class Search {
	
	public static int linearSearch(int[] dataSet, int target) {
		
		// iterate through dataSet searching for target
		
		for(int i = 0; i < dataSet.length; i++) {
			if (dataSet[i] == target) {
				return i; 
			 
			}
			
		}
	
		return -1; 
	}
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		// binary search assumes a sorted array and can continually split our search domain in half
		
		int middle = (int) Math.floor((start+end)/2); 
		int value = dataSet[middle]; 
		
		
		if( target > value ) {
			System.out.println(target +  " > " + value);
			return binarySearch(dataSet, target, middle +1, end); 
			
		} else if (target < value) {
			System.out.println(target +  " < " + value);

			return binarySearch(dataSet, target, start, middle - 1); 
		} 
		System.out.println(target + " = " + value);
		return middle; 
	}
	
}
