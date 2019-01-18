package oop;

class Person {
	
	String name; 
	String email;
	String phone; 
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat () {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// define properties
		person1.name = "Joe";
		person1.email = "joe@gmai.com"; 
		person1.phone ="11111111";
		
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat(); 
		
		
		Person person2 = new Person();
		person2.name = "Sarah";
		
		person2.sleep(); 
		/*
		//Person
		// atributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "092323444"; 
		
		//action, activity, behavior
		
		walking(name); 
		System.out.println(name + " is eating");
		
		// binding attributes and properties together 
	}
	
	//enhance by adding functions to minimize code
	
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
	
}
