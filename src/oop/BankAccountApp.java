package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		// Creating a new bank account >> instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		// With encapsulation
		
		acc1.setName("Roger"); 
		System.out.println(acc1.getName());
		acc1.setSsn("21332214134");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.balance = 10000; 
		acc1.accountNumber = "12131232112"; 
		acc1.deposit(5000);
		acc1.deposit(1000);
		acc1.withdraw(2000); 
		acc1.setRate();
		acc1.increaseRate(); 
		// polymorphism through overriding
		System.out.println(acc1.toString());
	
		// polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.checkBalance(); 

		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.checkBalance(); 
		
	/*
		// Demo for ingeritance
		
		CDAccount cd1 = new CDAccount(); 
		cd1.balance = 3000;
		cd1.name = "Mat";  
		cd1.intrestRate = "4.5"; 
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.Compound(); 
		*/
	}

}
