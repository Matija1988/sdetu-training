package datastructures;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		// Implement map interfaces 

		Map<Integer, String> hMap = new TreeMap <Integer, String>(); 
		mapUtil(hMap); 
		
		
	}
	
	public static void mapUtil(Map<Integer, String> map) {
		
		// 1. add key-value pairs
		
		map.put(101, "Steve"); 
		map.put(11, "Roger"); 
		map.put(221, "Mike");
		map.put(345, "Jennifer");
		map.put(678, "Kelly"); 
		map.put(36, "Alice"); 
		
		// 2. Expose / access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("see all key-value pair: " + map);
		
		// 3. Iterate through map of key value pairs
		
		for(int key : map.keySet()) {
			System.out.println("[ KEY: " + key + ". VALUE: " + map.get(key) + " ]");
		}
	}

}
