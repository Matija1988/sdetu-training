package algorithms;

import java.util.Scanner;

public class EuclidsAlgorithm {

	public static void main(String[] args) {
		 
		int a = 20;
		int b = 4;
		
		while(b != 0) { 
		 int t = a;
		 a = b; 
		 b = t % b; 
		}

	}	 

}
