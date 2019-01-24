package algorithms;

public class Demo {

	public static void main(String[] args) {
		
		int[] numbers = {10, 25, 23, 455, 56, 78, 232, 327, 345, 5, 689, 1}; 
		int[] sortedNumbers = {5,6,7,8,9,11,14,16,18,21,22,26,32,45,46,56,58,63,69}; 
		
		// Call a linear function that searches for a specific number
		
		int pos = algorithms.Search.linearSearch(numbers, 78); 
		System.out.println("Found at position "  + pos);
		
		// Call the binary search 
		int index = algorithms.Search.binarySearch(sortedNumbers,63, 0, sortedNumbers.length); 
		System.out.println("Found at position "  + index);
		
		// Call the bubble sort function
		
		Sort.bubbleSort(numbers); 
	}

}
