package datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		// 1. Define the collection
		
		Set<String> animals = new HashSet<String>(); 
		
		// 2. adding elements
		
		animals.add("dog");
		animals.add("pig");
		animals.add("snake");
		animals.add("chicken");
		animals.add("oro"); 
		
		System.out.println(animals + " " + animals.size());
		
		animals.add("dog");
		animals.add("pig");
		animals.add("anaconda");
		
		System.out.println(animals + " " + animals.size());
		
		// Create and a new set that we use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("chicken"); 
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("cat");
		farmAnimals.add("dog");
		farmAnimals.add("horse");
		farmAnimals.add("goose");
		farmAnimals.add("duck");
		
		// What is the INTERSECTION between animals and farm animals
		
		// 1. Copy existing set into a new set
		
		Set<String> intersectionSet = new HashSet<String>(animals); 
		
		
		
		// 2. Retain ONLT the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals); 
		System.out.println("The intersection is: " + intersectionSet);
		
		// What is the Union (are both animals and farm animals)
		
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the difference 
		
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);
	}

}
